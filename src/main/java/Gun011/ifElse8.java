package Gun011;

import java.util.Scanner;

public class ifElse8 {
    public static void main(String[] args) {
//girilen iki sayiyi kullanicidan aldiktan sonra toplama iicin "t", cikarma icin "c", carpma icin "p"
        //harflerini alarak istege uygun olan islemi yaptirip sonucu yazdir

/*
        Scanner sc= new Scanner(System.in);
        System.out.println("birinci sayi giriniz");
        int sayi1=sc.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int sayi2= sc.nextInt();

        System.out.println("toplam  icin T\ncikarma icin C\n carpma icin P\nbölme icin B");
*/



        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplam için T\nÇıkrma için C\nÇarpma için P\nBölme için B ye\n basınız.");
        Scanner oku2 = new Scanner(System.in);
        String islem = oku2.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1+sayi2));
        else
        if (islem.equalsIgnoreCase("C"))
            System.out.println("Cıkarma = " + (sayi1-sayi2));
        else
        if (islem.equalsIgnoreCase("P"))
            System.out.println("Carpma = " + (sayi1*sayi2));
        else
        if (islem.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (sayi1/sayi2));







    }
}
