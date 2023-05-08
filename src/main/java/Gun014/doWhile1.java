package Gun014;

import java.util.Scanner;

public class doWhile1 {
    public static void main(String[] args) {

        //kullanicinin 0 girilene kadar sayi isteyiniz .
        //bu soruyu once while ile yapiniz.

//        Scanner sc= new Scanner(System.in);
//        System.out.println("bir sayi girin");
//        int sayi=sc.nextInt();
//
//
//        while (sayi !=0){
//
//            System.out.println("sayi girin");
//            sayi=sc.nextInt();
//        }
//
//
        // Kullanıcıdan Sıfır girilene sayı isteyiniz.
        // bu soruyu önce while ile çözünüz.Sonra do-While

        Scanner oku=new Scanner(System.in);
        int sayi;

//        System.out.print("Sayı giriniz= ");
//        int sayi = oku.nextInt();
//
//        while(sayi != 0) {
//            System.out.print("Sayı giriniz= ");
//            sayi = oku.nextInt();
//        }

        // burada döngü içine mutlaka ilk kez girilir, işlemler yaılır, sonra döngü şartı
        // geçerli ise döngü dönmeye başlar.
        do{
            System.out.print("Sayı giriniz= ");
            sayi = oku.nextInt();
        }while(sayi !=0);

    }
}







