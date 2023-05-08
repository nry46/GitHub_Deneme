package Gun016;

import java.util.Scanner;

public class forLoop4 {
    public static void main(String[] args) {
        // girilen bir sayinin faktöryelini hesaplayin
        // 5! => 5*4*3*2*1


        Scanner sc=new Scanner(System.in);
        System.out.println(" bir sayi giriniz");

        int sayi=sc.nextInt();
        int fak=1;
        for (int i=1; i<=sayi;i++){
            fak=fak*i;
        }
        System.out.println("fak= " + fak);
    }
}
