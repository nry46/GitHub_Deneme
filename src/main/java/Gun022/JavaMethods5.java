package Gun022;

import java.util.Scanner;

public class JavaMethods5 {
    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıakrtarak sürekli değişkenleri alınız ve
        // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplam
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
        Scanner oku=new Scanner(System.in);
        int secim=0;

        do{
            System.out.println("****** Menü *******");
            System.out.println("1-toplama");
            System.out.println("2-çıkarma");
            System.out.println("3-çarpma");
            System.out.println("4-bölme");
            System.out.println("5-faktöryel");
            System.out.println("6-Çıkış");
            System.out.print("Seçiminiz=");
            secim = oku.nextInt();

            int sayi1=0;
            int sayi2=0;
            switch (secim)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("1.Sayı = ");
                    sayi1 = oku.nextInt();
                    System.out.print("2.Sayı = ");
                    sayi2 = oku.nextInt();
                    break;
                case 5:
                    System.out.print("Sayı = ");
                    sayi1 = oku.nextInt();
            }

            switch (secim)
            {
                case 1: toplamYaz(sayi1,sayi2);break;
                case 2: cikartmaYaz(sayi1,sayi2);break;
                case 3: carpmaYaz(sayi1,sayi2);break;
                case 4: bolmeYaz(sayi1,sayi2);break;
                case 5: faktoryelYaz(sayi1);break;
            }

        }while(secim >= 6);
    }

    public static void toplamYaz(int s1, int s2)
    {
        System.out.println("Toplam = " + (s1+s2));
    }

    public static void cikartmaYaz(int s1,int s2)
    {
        System.out.println("cikarma = " + (s2-s1));
    }
    public static void carpmaYaz(int s1, int s2){

        System.out.println("carpma = " + (s2*s1));
    }
    public static void bolmeYaz(int s1,int s2){
        System.out.println("bölme = " + (s2/s1));
    }
    public static void faktoryelYaz (int s1){
        System.out.println("bölme = " + (s1));
    }

    }

