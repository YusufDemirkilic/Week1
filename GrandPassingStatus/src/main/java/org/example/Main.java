package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcıdan verileri alıyoruz
        int m, f, t, k, mu, avarage, bol = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen matematik notunu giriniz: ");
        m = scanner.nextInt();
        System.out.println("lütfen fizik notunu giriniz: ");
        f = scanner.nextInt();
        System.out.println("lütfen kimyanotunu giriniz: ");
        k = scanner.nextInt();
        System.out.println("lütfen türkçe notunu giriniz: ");
        t = scanner.nextInt();
        System.out.println("lütfen müzik notunu giriniz: ");
        mu = scanner.nextInt();
        // girilen değerler 0 dan küçük 100 den büyük ise ortalamaya dahil etmiyoruz
        if (0 < m && m < 100) {
            m = 0;
            bol--;
        } else if (0 < f && f < 100) {
            f = 0;
            bol--;
        } else if (0 < t && t < 100) {
            t = 0;
            bol--;
        } else if (0 < k && k < 100) {
            k = 0;
            bol--;
        } else if (0 < mu && mu < 100) {
            mu = 0;
            bol--;
        }
        //ortalamayı hesaplıyoruz
        avarage = (m + f + t + k + mu) / bol;

        if (avarage < 55) {
            System.out.println("Sınıfı geçemedin abbas");
        } else {
            System.out.println("Tebrikler sınıfı geçtin ortalaman:" + avarage);
        }

    }
}