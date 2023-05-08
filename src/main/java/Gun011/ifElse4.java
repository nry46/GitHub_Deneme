package Gun011;

import java.util.Scanner;

public class ifElse4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Bir sayi giriniz.");;
        int sayi = sc.nextInt();

        if (sayi>0)
            System.out.println("pozitif");
        else
            //iki ihtimal var negatif veya sifir olabilir

            if(sayi<0)
            System.out.println("negatif");
        else
            System.out.println("sifir");

    }
}
