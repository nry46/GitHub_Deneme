package Gun010;

import java.util.Scanner;

public class Javaiif3 {
    public static void main(String[] args) {
        // girilen sayidan buyuk olanini ekrana yazdirin esit ise esit yazdirin.
        Scanner sc=new Scanner(System.in);
        System.out.print("birinci sayiyi girinsayi giriniz");
        int sayi1 =sc.nextInt();
        System.out.print("ikinci sayiyi girinsayi giriniz");
        int sayi2 =sc.nextInt();

        if(sayi1>sayi2){
            System.out.println(" sayi1 sayi2 den büyüktür");
        }
        if(sayi1==sayi2){
            System.out.println("sayi1 sayi2 ye esittir");
        }
        if(sayi1<sayi2){
            System.out.println(" sayi1 sayi2 den kucüktür");
        }

    }
}
