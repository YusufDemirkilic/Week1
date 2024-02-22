package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 12 ile bölümden kalan a göre
        // Çin Zodyağı nasıl hesaplanır?
        // kullanıcı seçimini göre string metodu ile tanımlamamızı yaptık
        int birthYear;
        String[] zodiac = new String[12];
        zodiac[0] = "monkey";
        zodiac[1] = "cockerel";
        zodiac[2] = "dog";
        zodiac[3] = "pig";
        zodiac[4] = "mouse";
        zodiac[5] = "cow";
        zodiac[6] = "tiger";
        zodiac[7] = "rabit";
        zodiac[8] = "dragon";
        zodiac[9] = "snake";
        zodiac[10] = "horse";
        zodiac[11] = "sheep";

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter birtyear information:  ");
        birthYear = scanner.nextInt();
        // kullanıcıdan alınan veri ile seçilene göre ekrana burç çıkıtısı yaptık
        for (int i = 0; i < 12; i++) {
            if (birthYear == i) {
                System.out.println("your zodiac sign "+zodiac[i]);

            }
        }

    }
}