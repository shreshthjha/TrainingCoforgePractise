package Assignment5;

import java.util.*;

public class EmployeeHashMap {
    public static void main(String[] args) {
        Map<Integer, Employee> employeesMap = new HashMap<>();

        // Add 5 employees
        employeesMap.put(101, new Employee(101, "Amit", "Delhi"));
        employeesMap.put(102, new Employee(102, "Neha", "Mumbai"));
        employeesMap.put(103, new Employee(103, "Rahul", "Bangalore"));
        employeesMap.put(104, new Employee(104, "Sneha", "Chennai"));
        employeesMap.put(105, new Employee(105, "Ravi", "Kolkata"));

        // Display all employees
        System.out.println("All Employees:");
        for (Map.Entry<Integer, Employee> entry : employeesMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Retrieve employee by ID
        int searchId = 103;
        System.out.println("\nEmployee with ID " + searchId + ": " + employeesMap.get(searchId));
    }
}

