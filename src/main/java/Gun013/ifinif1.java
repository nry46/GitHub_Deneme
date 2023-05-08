package Gun013;

import java.util.Scanner;

public class ifinif1 {
    public static void main(String[] args) {

        //girilen bir sayinin once 100 den kucuk ise, 100 den kücük yazsin,
        // devaminda 50 den kucukse 50den kucuk yazsin
        // devaminda 25 den kucukse 25 den kucuk yazsin
        Scanner sc = new Scanner(System.in);
        System.out.print(" Bir sayi giriniz = ");
        int sayi= sc.nextInt();
        if(sayi<100) {
            System.out.println("Sayi 100 den kucuk");

            if (sayi < 50) {
                System.out.println("Sayi 50 den kucuk");

                if (sayi < 25) {
                    System.out.println("Sayi 25 den kucuk");
                }

            }

        }






    }
}
