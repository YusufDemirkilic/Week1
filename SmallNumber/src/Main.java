import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int number = scanner.nextInt();

        System.out.println(number + " multiples of 4 and 5:");

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
