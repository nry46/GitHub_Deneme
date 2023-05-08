package Gun016;

import java.util.Scanner;

public class forLoop6 {
    public static void main(String[] args) {
        //girilen bir stringdeki a harfini sayisini bulunuz
        // c harfine sira gelirse döngüden cikilsin
        Scanner sc=new Scanner(System.in);
        System.out.println(" bir cumle giriniz");
        String cumle=sc.nextLine();
        
        int aMiktar=0;
        for (int i=0; i<cumle.length(); i++){
            if (cumle.charAt(i)=='a')
                aMiktar++;
            else 
                if (cumle.charAt(i)=='c')
                    break;
            System.out.println("döngü icinde ki isleme giren harfler = " + cumle.charAt(i));
        }

        System.out.println("aMiktar = " + aMiktar);
    }
}
