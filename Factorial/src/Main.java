import java.util.Scanner;

public class Main {
    // kombinasyon yapılıyor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,num2 ;
        float total=1,total2=1,total3=1;
        double combination;
        System.out.print("total number of people: ");
        num = scanner.nextInt();
        System.out.print("number of people selected for the team: ");
        num2 = scanner.nextInt();
        // C(n,r) = n! / (r! * (n-r)!) formül
        // n değerini hesplayalım
        for (long i=1;i<=num;i++){
            total=total *i;

        }// r değeri hesaplayalım
        for (int i=1;i<=num2;++i){
        total2=total2*i;

        }//(n-r)! değeri hesaplayalım
        for (int i=1;i<=(num - num2);++i){
            total3=total3*i;

        }

        combination=total/(total2*total3);
        System.out.println("Combination: "+combination);

    }
}