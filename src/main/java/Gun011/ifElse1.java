package Gun011;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {

        // girilen bir ögrencinin notuna göre 50 den buyukse gecti kucuk ise kaldi yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.print("notunuzu giriniz");
        int ogrNot=sc.nextInt();

        if(ogrNot >=50)
            System.out.println("Gectiniz");
        if(ogrNot < 50)
            System.out.println("Kaldiniz");



        if(ogrNot >= 50)
            System.out.println("Gectiniz");
        else
            System.out.println("kaldiniz");














    }
}
