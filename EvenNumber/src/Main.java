import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, totoal = 0, i = 0;
        boolean a = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleas enter number: ");
        number = scanner.nextInt();

        for (int j = 1; j <= number; j++) {
            if (j % 2 == 0) {
                System.out.println("even number: " + j);
                if (j % 3 == 0 && j % 4 == 0) {
                    totoal += j;
                    i++;
                }
            }
        }
        totoal = totoal / i;
        System.out.println("Average of numbers divisible by 3 and 4: " + totoal);


    }

}
