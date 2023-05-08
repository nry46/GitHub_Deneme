package Gun009.ödev;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
// girilen 3 basamakli  bir sayinin basamaklarina göre tersini bir sayi olarak ekrana yaz. ör;435->534
        Scanner sc=new Scanner(System.in);

        System.out.println("bir sayi gir");
        int sayi=sc.nextInt();
        int birler =(sayi%10);
        int onlar = (sayi/10)%10;
        int yuzler= (sayi/100)%10;

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);
        
        int tersi= birler*100 + onlar*10 + yuzler;
        System.out.println("tersi = " + tersi);














    }
}
