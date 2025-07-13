package Assignment2;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        if (password.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial)
            System.out.println("Password strength: Strong.");
        else if (password.length() >= 6 && hasUpper && hasLower && hasDigit)
            System.out.println("Password strength: Medium.");
        else
            System.out.println("Password strength: Weak.");
    }
}

