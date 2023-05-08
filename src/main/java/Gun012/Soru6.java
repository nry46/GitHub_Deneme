package Gun012;

import java.util.Scanner;

public class Soru6 {
    // kullanicidan alt ve ust degeri tek bir satirda arasinda bosluk olarak once min bie bosluk sonra max sayiuretiniz yazdir

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    //    System.out.print("Bulunacak sayı aralığını space ile giriniz : ");
//        String girilen=sc.nextLine();
//        int bosluk=girilen.indexOf(" ");
//        String ilk=girilen.substring(0,bosluk);
//        String ikinci=girilen.substring(bosluk+1);
//
//        int ilksayi=Integer.parseInt(ilk);
//        int ikincisayi=Integer.parseInt(ikinci);
//
//        int random=(int) ((Math.random()*(ikincisayi-ilksayi)+1)+ilksayi);
//        System.out.println("random = " + random);
//
//



        Scanner oku = new Scanner(System.in);
        System.out.print("min max degerini yan yana bir boşlukla giriniz =");
        String min_max = oku.nextLine();

        int boslukIndex=min_max.indexOf(" ");
        int min = Integer.parseInt( min_max.substring(0, boslukIndex) );
        int max = Integer.parseInt( min_max.substring(boslukIndex+1) );

        int randomNumberInRange = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNumberInRange = " + randomNumberInRange);







    }
}
