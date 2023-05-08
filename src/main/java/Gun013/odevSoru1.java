package Gun013;

import java.util.Scanner;

public class odevSoru1 {

    public static void main(String[] args) {
//        Günün Soruları
//        1- Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.

//
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Bir sayi giriniz = ");
//        int gun= sc.nextInt();
//        int a=gun%7;
//
//
//
//        switch (a){
//            case 0: System.out.println("carsamba");break;
//            case 1: System.out.println("persembe");break;
//            case 2: System.out.println("cuma");break;
//            case 3: System.out.println("cumartesi");break;
//            case 4: System.out.println("pazar");break;
//            case 5: System.out.println("pazartesi");break;
//            case 6: System.out.println("sali");break;




        Scanner oku = new Scanner(System.in);

        System.out.print("bir gun giriniz=");
        String gunNo = oku.nextLine();

        System.out.print("kac gun sonraki gunu bulmak istiyorsunuz=");
        int kacgunsonra = oku.nextInt();


        if (gunNo.equalsIgnoreCase("pazartesi"))
            gunNo = "1";
        else if (gunNo.equalsIgnoreCase("sali"))
            gunNo = "2";
        else if (gunNo.equalsIgnoreCase("carsamba"))
            gunNo = "3";
        else if (gunNo.equalsIgnoreCase("persembe"))
            gunNo = "4";
        else if (gunNo.equalsIgnoreCase("cuma"))
            gunNo = "5";
        else if (gunNo.equalsIgnoreCase("cumartesi"))
            gunNo = "6";
        else if (gunNo.equalsIgnoreCase("pazar"))
            gunNo = "0";


        int gunson=Integer.parseInt(gunNo);

        int gunmod = kacgunsonra % 7;

        int k = 0;

        switch (gunmod) {
            case 0: k = gunson;break;
            case 1: k = gunson + 1;break;
            case 2: k = gunson + 2;break;
            case 3: k = gunson + 3;break;
            case 4: k = gunson + 4;break;
            case 5: k = gunson + 5;break;
            case 6: k = gunson + 6;break;
            default:
                System.out.println("yanlis giris yaptiniz");
        }

        if (k==0)
            System.out.println("pazar");
        else if (k==1)
            System.out.println("pazartesi");
        else if (k==2)
            System.out.println("sali");
        else if (k==3)
            System.out.println("carsamba");
        else if (k==4)
            System.out.println("persembe");
        else if (k==5)
            System.out.println("cuma");
        else if (k==6)
            System.out.println("cuma");









        }















    }

