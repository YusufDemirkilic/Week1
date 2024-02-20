import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int armut, elma, domates, muz, patlıcan;

        double toplam, armutkg = 2.14, elmakg = 3.67, domateskg = 1.11, muzkg = 0.95, patlıcankg = 5.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kaç kilo armut alıcğınızı girin: ");
        armut = scanner.nextInt();
        System.out.println("lütfen kaç kilo elma alıcğınızı girin: ");
        elma = scanner.nextInt();
        System.out.println("lütfen kaç kilo domates alıcğınızı girin: ");
        domates = scanner.nextInt();
        System.out.println("lütfen kaç kilo muz alıcğınızı girin: ");
        muz = scanner.nextInt();
        System.out.println("lütfen kaç kilo patlıcan alıcğınızı girin: ");
        patlıcan = scanner.nextInt();
        toplam = armut * armutkg + elma * elmakg + domates * domateskg + muzkg * muz * patlıcan * patlıcankg;
        System.out.println("toplam tutar: " + toplam + " TL");


    }
}