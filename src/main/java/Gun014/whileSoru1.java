package Gun014;

import java.util.Scanner;

public class whileSoru1 {
    public static void main(String[] args) {
        
        //girilen bir sayiya kadar olan sayilarin toplamini bularak yazdirin
       Scanner sc= new Scanner(System.in);
       System.out.println("bir sayi girin");
        int sayi= sc.nextInt();
//
//        int sayac=1;
//        int toplam=0;
//        while (sayac<=sayi){
//
//            toplam=toplam+sayac;
//            sayac++;


//        }
//
//        System.out.println("toplam = " + toplam);

     //   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        // sayac degiskeni kullanmadan sonuc bulma
        
        int toplam=0;
        while (sayi>0){
            
            toplam=toplam+sayi;
            sayi--;

        }

        System.out.println("toplam = " + toplam);
        
        
    }
}
