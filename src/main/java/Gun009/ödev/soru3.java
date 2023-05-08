package Gun009.ödev;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi girin");

/*
        int birler,onlar,yuzler,binler;


        System.out.println("4 basamaklı bir sayı giriniz: ");


        int sayi=sc.nextInt();


        birler=sayi-((sayi/10)*10);


        sayi=sayi/10;


        onlar=sayi-((sayi/10)*10);


        sayi=sayi/10;


        yuzler=sayi-((sayi/10)*10);


        sayi=sayi/10;


        binler=sayi;


        System.out.println("Binler: "+binler+"\n"+"Yüzler: "+yuzler+"\n"+"Onlar: "+onlar+"\n"+"Birler: "+birler);*/
        
        
        int sayi=sc.nextInt();
        
        int bolum = sayi/100;
        int kalan= bolum%10;

        System.out.println("kalan = " + kalan);
        
        

        
        
    }
}
