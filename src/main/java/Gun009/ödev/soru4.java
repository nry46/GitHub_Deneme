package Gun009.ödev;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        //4= girilen 3 basamli bir sayinin basamaklarinin toplamini ekrana yazdirin

        Scanner sc= new Scanner(System.in);
        System.out.println(" bir sayi grin");
        int sayi=sc.nextInt();
        int birler =(sayi%10);
        int onlar = (sayi/10)%10;
        int yuzler= (sayi/100)%10;
        System.out.println(birler+onlar+yuzler);










    }
}
