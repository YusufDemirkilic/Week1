import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("base value: ");
        int base = scanner.nextInt();
        System.out.print("upper value: ");
        int up = scanner.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= up; i++) {
            sonuc *= base;
        }

        System.out.println(base + "^" + up + " = " + sonuc);
    }
}
