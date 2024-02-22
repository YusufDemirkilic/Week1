package org.example;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcıdan veri alndı
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter year value: ");
        year = scanner.nextInt();
        // yıl 4 ün katı ve 100 e bölümğnden kalan 0 değilse yazdır
        if (year % 4 == 0 && !(year % 100 == 0)) {

            System.out.println(year + " leap Year.");
            // 400 ile bölümden kalan 0 ise yazdır
        } else if (year % 400 == 0) {

            System.out.println(year + "  Leap year");

        } else {
            System.out.println(year + "  not a leap year");
        }

    }
}
