package Gun016;

import java.util.Scanner;

public class forLoop3 {
    public static void main(String[] args) {
        // kullanicinin gireceginbir rakama kadar olan sayilarinin toplamini bulunuz.

        Scanner sc=new Scanner(System.in);
        System.out.println(" bir sayi giriniz");
        
        int sayi=sc.nextInt();
        int toplam=0;
        for (int i=1; i<=sayi; i++){
            toplam=toplam+i;
        }
        System.out.println("toplam = " + toplam);
        
        
        
        
        
        
    }
}
