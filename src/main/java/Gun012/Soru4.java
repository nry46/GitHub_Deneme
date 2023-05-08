package Gun012;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

     // girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisiniz.
     // kullanici bilirse tebrikler yazdirin.

        Scanner sc = new Scanner(System.in);
        System.out.print(" sayi gir");
        int KacaKadarsayi =sc.nextInt();

        int uretilen= (int)(Math.random() * KacaKadarsayi+1);
        System.out.print("   sayi tahmininiz   = "    );
        int tahmin=sc.nextInt();

        if (uretilen == tahmin)
            System.out.println("tebrikler");
        else
            System.out.println("bilemidin canim:");
        System.out.println("uretilen = " + uretilen);











    }
}
