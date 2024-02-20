import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz: ");
        a = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        b = scanner.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz: ");
        c = scanner.nextInt();
        toplam = (a + b) * (c - b);
        System.out.println("toplam: " + toplam);

    }
}