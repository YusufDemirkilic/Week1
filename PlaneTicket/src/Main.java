import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // veriable deinition
        int distance, age, travelCohice;
        double discount, ticketPrice, totalPrice = 1;
        // receiving data from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the distance value: ");
        distance = scanner.nextInt();
        System.out.print("Please enter the age value: ");
        age = scanner.nextInt();
        System.out.print("Please enter the travel cohice value (1 => one way or 2 => round trip): ");
        travelCohice = scanner.nextInt();
        // value control
        if (distance > 0 && age > 0) {
            ticketPrice = distance * 0.10;
            // discount based on user age
            if (age < 12) {
                discount = ticketPrice * 0.5;
                totalPrice = ticketPrice - discount;
            } else if (age >= 12 && age <= 24) {
                discount = ticketPrice * 0.1;
                totalPrice = ticketPrice - discount;
            } else if (age >= 65) {
                discount = (ticketPrice * 0.3);
                totalPrice = ticketPrice - discount;
            } else {
                totalPrice = ticketPrice;
            }
            //users ticket choice for ticket discount
            switch (travelCohice) {
                case 1:
                    System.out.println("Total Price: " + totalPrice);
                    break;
                case 2:
                    discount = (totalPrice * 0.2);
                    totalPrice = (totalPrice - discount) * 2;
                    System.out.println("Total Price: " + totalPrice);
                    break;
                default:
                    System.out.println("Invalid travel cohice value");
            }


        } else {
            System.out.println("Age or distance can't be negative value please try again ");
        }
    }

}
