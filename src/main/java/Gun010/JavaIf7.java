package Gun010;

import java.util.Scanner;

public class JavaIf7 {

    public static void main(String[] args) {

        // girilen bir sayinin onlar basamaginin tek mi cift mi oldugunu bulun
        Scanner sc = new Scanner(System.in);

        System.out.print("  sayi  giriniz = ");
        int sayi = sc.nextInt();

        int onlar= (sayi/10) %10;
        if (onlar% 2== 0)

            System.out.println("sayi cift sayidir");


        if (onlar % 2==1 )
            System.out.println("sayi tektir");



    }

}


