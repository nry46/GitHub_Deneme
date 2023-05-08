package Gun009.ödev;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //1 = girilen 1 sayinin birler basamagini ekrana yazdirin.




        Scanner sc = new Scanner(System.in);

        System.out.println("4 basamakli bir sayi giriniz");


        int sayi = sc.nextInt();
        int kalan = sayi - ((sayi / 10) );

        
        int onlar = sayi%10;
        System.out.println( sayi- sayi/10 *10 );





    }
}
