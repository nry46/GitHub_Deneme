package Gun013;

import java.util.Scanner;

public class odevSoru2 {
    public static void main(String[] args) {

//2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner sc = new Scanner(System.in);
        System.out.print(" üc basamakli Bir sayi giriniz = ");
        int sayi= sc.nextInt();

        int yüzler=(sayi/100)%10;
        int onlar =(sayi/10)%10;
        int birler=(sayi%10);

        switch (yüzler){

            case 0: System.out.println("");break;
            case 1: System.out.println("yüz");break;
            case 2: System.out.println("ikiyüz");break;
            case 3: System.out.println("ücyüz");break;
            case 4: System.out.println("dörtyüz");break;
            case 5: System.out.println("besyüz");break;
            case 6: System.out.println("altiyüz");break;
            case 7: System.out.println(" yediyüz");break;
            case 8: System.out.println("sekizyüz");break;
            case 9: System.out.println("dokuzyüz");break;

        }
        switch (onlar){

            case 0: System.out.println("");break;
            case 1: System.out.println("on");break;
            case 2: System.out.println("yirmi");break;
            case 3: System.out.println("otuz");break;
            case 4: System.out.println("kirk");break;
            case 5: System.out.println("elli");break;
            case 6: System.out.println("altmis");break;
            case 7: System.out.println("yetmis");break;
            case 8: System.out.println("seksen");break;
            case 9: System.out.println("doksan");break;


        }

        switch (birler){

            case 0: System.out.println(" "); break;
            case 1: System.out.println("bir "); break;
            case 2: System.out.println("iki "); break;
            case 3: System.out.println("üc "); break;
            case 4: System.out.println("dört "); break;
            case 5: System.out.println("bes "); break;
            case 6: System.out.println("alti "); break;
            case 7: System.out.println("yedi "); break;
            case 8: System.out.println("sekiz "); break;
            case 9: System.out.println("dokuz "); break;

        }

















    }
}
