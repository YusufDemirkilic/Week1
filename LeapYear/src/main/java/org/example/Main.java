package org.example;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter year value: ");
        year = scanner.nextInt();

        if (year % 4 == 0 && !(year % 100 == 0)) {

            System.out.println(year + " leap Year.");
        } else if (year % 400 == 0) {

            System.out.println(year + "  Leap year");

        } else {
            System.out.println(year + "  not a leap year");
        }

    }
}