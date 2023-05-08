package Gun050.task2;
// Girilen bir sayinin basamaklarina göre tersini yaziniz.

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Tersi yazilacak bir sayi giriniz.");

        int sayi=oku.nextInt();
        int tersiSayi=0;

        while (sayi>0){

            int basamak =sayi%10;
            sayi/=10;
            tersiSayi=tersiSayi*10+basamak;
            System.out.print(basamak);
        }

    }

}
