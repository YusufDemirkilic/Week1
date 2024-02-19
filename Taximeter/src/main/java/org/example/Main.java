package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıdan kaç klm yol gittiği bilgisi hesaplanacak
        // taksimetre km başına yazan tutar hesaplanacak
        // kaç kilometre yol gidildiği hesaplanacak
        //20 tl minumum ücret 20 tl alımacak ve başlangıç 10 tl ile başlayacak
        int km;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen gidilecek km belirtiniz: ");
        km=+scanner.nextInt();
        if ((km*2.20)<10){
            System.out.println("ödencek tutar 20 TL");
        }
        else {
            System.out.println("Ödenecek tutar: "+(10+km*2.20));
        }
    }
}