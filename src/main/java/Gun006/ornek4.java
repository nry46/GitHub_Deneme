package Gun006;

import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {

        // kullanicidan alacaginiz 2 sayinin toplamini ekrana yaziniz-

        Scanner sc = new Scanner(System.in);

        System.out.print(" Bir sayi giriniz ");
        int sayi1 = sc.nextInt();
        System.out.println("sayi1 = " + sayi1);



        System.out.print(" Ikinci bir sayi giriniz :");

        int sayi2 =sc.nextInt();
        System.out.println("sayi2 = " + sayi2);


        int toplam = sayi1 + sayi2 ;
        System.out.println("toplam = " + toplam);


    }
}
