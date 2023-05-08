package Gun044.JavaTryCatch;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        try {// hatanin olma ihtimali oldugu kodlar bu bölüme alinir.

            Scanner sc = new Scanner(System.in);
            System.out.print(" 1. sayiyi giriniz : ");
            int a = sc.nextInt();

            System.out.print(" 2. sayiyi giriniz : ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (Exception hata)  // haata oldugunda calidsacak bolum
        {
            System.out.println("hata oldu");
//            System.out.println("hata.getMessage() = " + hata.getMessage());
//            hata.printStackTrace();

            System.out.println("2. sayiya 0 vermeyiniz.");
        }

        // 2. sayi sifir girildiginde AritmetikExeption
        // harf girildiginde ise InputMismatchException
    }
}
