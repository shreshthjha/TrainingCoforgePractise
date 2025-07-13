package Assignment3;

import java.util.Scanner;

class Student {
    private String name;
    private int yearOfJoining;
    private String address;

    // Constructor
    public Student(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display student info
    public void display() {
        System.out.printf("\n", name, yearOfJoining, address);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        // Taking input using constructor
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Year of Joining: ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.print("Address: ");
            String address = sc.nextLine();

            students[i] = new Student(name, year, address);
        }

        // Printing header and student info
        System.out.printf("\n \n", "Name", "Year of Joining", "Address");
        for (Student s : students) {
            s.display();
        }
    }
}
