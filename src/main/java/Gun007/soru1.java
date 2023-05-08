package Gun007;

import java.util.Scanner;

public class soru1 {

    public static void main(String[] args) {

        // kullanicidan alacagimiz bir kelimenin son harfini yazdirin


        System.out.print("bir kelime giriniz");
        Scanner sc =new Scanner(System.in);
        String kelime = sc.nextLine();

       int uzunluk= kelime.length();
       char sonharf =kelime.charAt(uzunluk-1) ;
        System.out.println("sonharf = " + sonharf);
        System.out.println(" sonharf = " + kelime.charAt(kelime.length()-1));


    }
}
