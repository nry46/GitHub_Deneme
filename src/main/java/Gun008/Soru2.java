package Gun008;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        // kullanicidan tek sefer de alacaginiz 2 kelimelik ad  soyad ayri 2 kelime olarak ayirin..
        // ad ayri soyad ayri sekilde yazdirin.

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen adinizi ve Soyadinizi giriniz = ");

        String adSoyad = sc.nextLine();


        int boslukIndex= adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, boslukIndex);
        String Soyad = adSoyad.substring(boslukIndex +1);


        System.out.println("ad = " + ad);

        System.out.println("Soyad = " + Soyad);


















    }
}
