package Gun010;

import java.util.Scanner;

public class javaIf6 {
//  girilen 3 sayidan en büyük olanini bulun
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("  sayi1  giriniz = ");
        int sayi1= sc.nextInt();

        System.out.print("sayi2 giriniz = ");
        int sayi2 =sc.nextInt();

        System.out.print("sayi3 giriniz  = ");
        int sayi3 =sc.nextInt();

       int enBuyuk=sayi1;
        
       if (sayi2>enBuyuk)
           enBuyuk=sayi2;
       if (sayi3>sayi2)
           enBuyuk=sayi3;

        System.out.println("enBuyuk = " + enBuyuk);



    }





}
