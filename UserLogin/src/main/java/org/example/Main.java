package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user, password, resetPassword, p = "password", u = "yusuf";
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        user = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();
        //check value
        if (user.equals(u) && password.equals(p)) {
            System.out.println("Giriş Başarılı.");
        } else {
            //the password is not correct,the password is requested to be reset
            System.out.println("Username or password are not correct \n reset your password \n 1 : Yes \n 2 : No");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("enter new password:");
                resetPassword = scanner.nextLine();
                //Check the passwords
                if (resetPassword.equals(p)) {
                    System.out.println("the old password will not be the same as the new one. ");
                }
                // if the two password are different, change the password
                else {
                    System.out.println("password was changed");

                }

            } else if (choice == 2) {
                System.out.println("password change not selected");
            }


        }
    }

}
