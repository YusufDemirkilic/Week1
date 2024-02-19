package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        int base,lenght,hypotenuse;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter base value: ");
        base=scanner.nextInt();
        System.out.println("Pleas enter lenght value: ");
        lenght=scanner.nextInt();
        System.out.println("Pleas enter hypotenuse value: ");
        hypotenuse=scanner.nextInt();
        int total= (base + lenght +hypotenuse)/2;
        double area= total*(total-base)*(total-lenght)*(total-hypotenuse);
        System.out.println("Area of triangle: "+ Math.sqrt(area));
    }
}