package Gun007;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {


        // Soru :  kullanicidan tek bir komutla okunan 2 kelimelik ad syad,
        // ekrana ilk harfleri ve nokta sekilde yazdirin- ör Ahmet Yilmaz -> A.Y


        Scanner sc = new Scanner(System.in);
        System.out.print(" adiniz ve soyadiniz = " );
        String adim= sc.nextLine();

        char ilkharf= adim.charAt(0);
        int bosluk =adim.indexOf(" ");
        char soyadilkharf =adim.charAt(bosluk +1);

        System.out.println(ilkharf+ "."+soyadilkharf+".");









    }
}
