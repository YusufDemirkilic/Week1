package org.example;

import com.sun.source.tree.NewArrayTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,opration;
        Scanner scanner = new  Scanner(System.in);
                // user enter in two value and opreations
        System.out.println("Please enter in value one: ");
        a=scanner.nextInt();
        System.out.println("Please enter in value two:");
        b=scanner.nextInt();
        System.out.println("Please, Calculating operation select \n 1: +\n 2: - \n 3: / \n 4: * ");
        opration=scanner.nextInt();
        //calculator operation selection
        switch (opration){
            case 1:
                System.out.println("additon : "+(a+b));
                break;
            case 2:
                System.out.println("subtraction : "+(a-b));
                break;
            case 3:
                System.out.println("division : "+(a/b));
                break;
            case 4:
                System.out.println("multiplication : "+(a*b));
                break;
            default:
                System.out.println("You chose the wrong action");
        }


    }
}