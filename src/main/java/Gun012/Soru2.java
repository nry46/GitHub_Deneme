package Gun012;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // math.max yontemi ilr girilen 3 sayidan buyuk olani bulun
        Scanner sc= new Scanner(System.in);

        System.out.println("1. sayi giriniz");
        int sayi1=sc.nextInt();

        System.out.println("2 sayi giriniz ");
        int sayi2=sc.nextInt();

        System.out.println("3. sayiyi girin");
        int sayi3=sc.nextInt();

        System.out.println("enbuyuk  = " + Math.max(Math.max(sayi1,sayi2),sayi3));


    }
}
