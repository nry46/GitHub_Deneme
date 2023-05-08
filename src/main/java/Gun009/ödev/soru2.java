package Gun009.ödev;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //2= girilen 1 sayinin onlar basamagini ekrana yazdirin

        Scanner sc= new Scanner(System.in);
        System.out.println(" 4 basamakli bir sayi giriniz = ");
        int sayi=sc.nextInt();

        int bolum =sayi/10;
        int kalan = bolum%10;
        System.out.println("kalan = " + kalan);


















    }
}
