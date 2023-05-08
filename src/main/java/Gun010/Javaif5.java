package Gun010;

import java.util.Scanner;

public class Javaif5 {
    public static void main(String[] args) {

        //girilen bir sayinin birler basamagini yazi ile yazdirin

        Scanner sc = new Scanner(System.in);

        System.out.print(" Bir sayi giriniz = ");
        int sayi= sc.nextInt();

        int birler = sayi %10;

        if (birler==0) System.out.println("sifir");
        if (birler==1) System.out.println("bir");
        if (birler==2) System.out.println("iki");
        if (birler==3) System.out.println("uc");
        if (birler==4) System.out.println("dort");
        if (birler==5) System.out.println("bes");
        if (birler==6) System.out.println("alti");
        if (birler==7) System.out.println("yedi");
        if (birler==8) System.out.println("sekiz");
        if (birler==9) System.out.println("dokuz");

        if (sayi<0)
            sayi = sayi*-1;
        System.out.println(" negatifdir");



    }
}
