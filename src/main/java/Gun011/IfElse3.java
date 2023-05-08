package Gun011;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Bir sayi giriniz.");;
        int sayi = sc.nextInt();
        if (sayi%2==0)
            System.out.println("cift sayi");
        else
            System.out.println("tek sayi" );

    }
}
