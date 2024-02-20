package org.example;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        double height, index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your weight in kilograms value: ");
        weight = scanner.nextInt();
        System.out.println("please enter your height in meters value: ");
        height = scanner.nextDouble();
        index = weight / (height * height);
        System.out.println("Your body mass index: " + index);

    }
}