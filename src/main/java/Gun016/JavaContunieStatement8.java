package Gun016;

import java.util.Scanner;

public class JavaContunieStatement8 {
    public static void main(String[] args) {
        // kullanicidan 5 adet sayi isteyin.
        //bu sayilardan 5 ile 10 arasinda haric
        // digerlerini ntoplamini bulunuz
        // bu soruyu contunie olarak cozun


        Scanner sc=new Scanner(System.in);

        int toplam=0;

        for (int i=1; i<=5; i++){
            System.out.print("sayi giriniz = ");
            int sayi=sc.nextInt();


            if (sayi>5 && sayi<10)
                continue;
            toplam=toplam+sayi;


        }

        System.out.println("toplam = " + toplam);






    }
}
