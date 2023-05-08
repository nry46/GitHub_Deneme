package Gun008;

import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {


      // kullanicidan alacagini bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.

        Scanner sc = new Scanner(System.in);

        System.out.println(" Bir string giriniz =");
        String  text  = sc.nextLine();

        boolean boslukVarmi = text.contains(" ");
        System.out.println("boslukVarmi = " + boslukVarmi);
        
        boolean bosMU=text.isEmpty();
        System.out.println("bosMU = " + bosMU);

















    }
}

