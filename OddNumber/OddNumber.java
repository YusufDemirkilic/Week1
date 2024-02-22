package OddNumber;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int number;
        boolean a = true;
        Scanner scanner = new Scanner(System.in);


        while (a) {
            System.out.print("Pleas enter number: ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                System.out.println("Numbers that are multiples of four: " + number);

            } else if (!(number % 2 == 0)) {
                System.out.println("Odd number: " + number);
                a = false;
            }


        }
    }
}
