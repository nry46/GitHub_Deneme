package Gun014;

import java.util.Scanner;

public class whileSoru3 {
    public static void main(String[] args) {
        //kullanicidan 5 sayi isteyin bu sayilardan en buyugunu bulun.
        Scanner sc= new Scanner(System.in);

        int enb=0;
        int sayac=1;
        while (sayac<=5){
            System.out.println("bir sayi girin");
            int sayi=sc.nextInt();
//            if (sayi>enb)
//                enb=sayi;


            enb= Math.max(enb ,sayi);
            sayac++;
        }

        System.out.println("en buyuk sayi = " + enb);











    }
}
