package Gun013;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {

        //katsayilari verilen iki bilinmeyenli denklemin köklerini bulunuz.
        //ax²+bx +c;

        //Çözüm adımları
        // kullanıcıdan a,b,c yi okutun.
        // Delta = b*b - 4*a*c
        // Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2*a)  , x2= (-b - kök(d)) / (2*a)
        // Delta = 0 => 1 tane kök vardır x = -b/2a
        // Delta < 0 ise kök yoktur

        Scanner sc = new Scanner(System.in);
        System.out.print(" a yi giriniz = ");
        int a= sc.nextInt();

        System.out.print(" b yi giriniz = ");
        int b= sc.nextInt();

        System.out.print(" c yi giriniz = ");
        int c= sc.nextInt();

        int d=b*b -(4*a*c);


//        if (delta>0) {
//            System.out.println("x1: " + ((-b + Math.sqrt(delta)) / (2*a)));
//            System.out.println("x2: " + ((-b - Math.sqrt(delta)) / (2*a)));
//        }
//        else if (delta==0){
//            System.out.println("x: "+(-b)/(2*a));
//        }
//        else if (delta<0) {
//            System.out.println("kok yoktur");
//
//
//        }
//
//
//

        if (d > 0) {
            System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2*a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2*a)));
        }
        else
        if (d == 0){
            System.out.println("x = " + (-b/2*a) );
        }
        else
            System.out.println("kök yoktur");
    }








    }



