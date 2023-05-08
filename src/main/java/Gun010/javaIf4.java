package Gun010;

import java.util.Scanner;

public class javaIf4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // girilen bir sayinin tek mi cift oldugunu yazdirin.
        System.out.print("bir sayi girinit");
        int sayi =sc.nextInt();

        if (sayi % 2 ==0)

            System.out.println("sayi cift sayidir");


        if (sayi % 2==1 )
            System.out.println("sayi tektir");


    }
}
