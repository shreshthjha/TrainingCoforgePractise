package Assignment3;

import java.util.Scanner;

class Employee {
    private int salary;
    private int hoursPerDay;

    public void getInfo(int salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursPerDay < 6) {
            hoursPerDay += 2;
        }
    }

    public void displayFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter employee's salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter hours of work per day: ");
        int hours = sc.nextInt();

        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();
        emp.displayFinalSalary();
    }
}

