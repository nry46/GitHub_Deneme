package Gun011;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // girilen vize 0,40 ve final notunu 0,60 okuyarak ortalamayi bulunuz.
       // ortalama 60 dan buyukse gectiniz tebrikler yazin. Degilse butunlemeye kaldiniz seklinde yazin.

        System.out.println(" vize notunuzu giriniz");
        double vize= sc.nextDouble();
        System.out.println("Final Notunuzu girin");
        double fina = sc.nextInt();
        double ort= (vize*0.40) + (fina*0.6);

        System.out.println("ort = " + ort);
        if( ort>=60)
            System.out.println("Tebrikler gectiniz");

        else
            System.out.println("butunlemeye kaldiniz");






















    }
}
