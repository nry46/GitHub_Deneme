package Gun009;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

       // girilen iki kelimelik ad ve soyadlarin ilk harflerinin hepsini kücük daha sonra büyük azdirin.

        Scanner sc= new Scanner(System.in);
        System.out.println(" adinizi ve Soyadinizi giriniz : ");
        String tamAd = sc.nextLine();

       String  ilkharf= tamAd.substring(0,1).toUpperCase();
        int boslukIndex =  tamAd.indexOf(" ");
        String soyadIlkHarf =tamAd.substring(boslukIndex+1,boslukIndex+2).toLowerCase();

        System.out.println("ilkharf = " + ilkharf);
        System.out.println("soyadIlkHarf = " + soyadIlkHarf);
        
        String yeniTamad = ilkharf +tamAd.substring(1,boslukIndex+1)+soyadIlkHarf + tamAd.substring(boslukIndex +2);

        System.out.println("yeniTamad = " + yeniTamad);



















    }
}
