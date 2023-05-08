package Gun010;

import java.util.Scanner;

public class Javaif2 {

    public static void main(String[] args) {

        // girilen bir sayinin negatif mi pozitif mi oldugunu yazdirin.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi girin");

        int sayi =sc.nextInt();
        if (sayi>0){
            System.out.println(" pozitif sayi");

        }

        if (sayi<0){
            System.out.println("negatif sayi");
        }
        if (sayi==0){
            System.out.println(" sayi sifirdir");
        }




    }
}
