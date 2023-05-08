package Gun009.ödev;

import java.util.Scanner;

public class soru7 {

    public static void main(String[] args) {

        //7=kullanician vize ve final notunu aliniz  ort= 0,4*vize +0,6* final olarak bulun

        Scanner sc =new Scanner(System.in);
       int v,f;
       float ort;
        System.out.print(" vize notunuzu giriniz = ");
        v=sc.nextInt();

        System.out.print("final notunuzu giriniz = ");
         f=sc.nextInt();

         ort =(float)(v*0.4 +f*0.6);

        System.out.println("ort = " + ort);
         

































    }

















}
