package Gun010;

import java.util.Scanner;

public class JavaIf1 {

    public static void main(String[] args) {

        // girilen bir sayinin 10 dan buyuk ise  ekrana 10 dan buyuktur  diye ekrana yazidirin.

        Scanner sc= new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");

        int sayi =sc.nextInt();
        if (sayi >10) { // if  in icinde yapilacaklar 1 satirdan fazla ise süslü parantez sart

            System.out.println(" girilen sayi 10 dan büyüktür");
        }
    }
}
