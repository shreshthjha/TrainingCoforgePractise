package Assignment5;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)
        ) {
            System.out.println("Connected to database!");

            while (true) {
                System.out.println("\n1. Add Employee");
                System.out.println("2. View Employee by ID");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. View All Employees");
                System.out.println("6. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1: // INSERT
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter City: ");
                        String city = sc.nextLine();
                        addEmployee(conn, new Employee(id, name, city));
                        break;
                    case 2: // READ by ID
                        System.out.print("Enter ID to view: ");
                        int viewId = sc.nextInt();
                        getEmployeeById(conn, viewId);
                        break;
                    case 3: // UPDATE
                        System.out.print("Enter ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new City: ");
                        String newCity = sc.nextLine();
                        updateEmployee(conn, new Employee(updateId, newName, newCity));
                        break;
                    case 4: // DELETE
                        System.out.print("Enter ID to delete: ");
                        int deleteId = sc.nextInt();
                        deleteEmployee(conn, deleteId);
                        break;
                    case 5: // READ all
                        getAllEmployees(conn);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    private static void addEmployee(Connection conn, Employee emp) throws SQLException {
        String sql = "INSERT INTO employees (id, name, city) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getCity());
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee added.");
        }
    }

    // READ
    private static void getEmployeeById(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM employees WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", City: " + rs.getString("city"));
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    // UPDATE
    private static void updateEmployee(Connection conn, Employee emp) throws SQLException {
        String sql = "UPDATE employees SET name = ?, city = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getCity());
            ps.setInt(3, emp.getId());
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) updated.");
        }
    }

    // DELETE
    private static void deleteEmployee(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee(s) deleted.");
        }
    }

    // READ ALL
    private static void getAllEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employees";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", City: " + rs.getString("city"));
            }
        }
    }
}

