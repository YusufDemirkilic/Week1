package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius, area, circumference, angel, angel_formul;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius value: ");
        radius = scanner.nextDouble();
        //kullanıcan alınan değer ile alan ve çevreyi hesaplayalım
        area = radius * radius * pi;
        circumference = 2 * pi * radius;
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
        // kullanıcan alınan açı ile açı ölçüsünün alnını bulalım
        System.out.println("Please enter angel value: ");
        angel = scanner.nextDouble();
        angel_formul = area * angel / 360;
        System.out.println("angle area: " + angel_formul);


    }
}