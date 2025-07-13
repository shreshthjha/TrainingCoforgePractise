package Assignment1;

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        int age = 2024 - birthYear;
        System.out.println("You are " + age + " years old.");
    }
}

