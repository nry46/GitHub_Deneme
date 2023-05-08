package Gun014;

import java.util.Scanner;

public class whileSoru2 {
    public static void main(String[] args) {
        //girilen bir sayiya kadar olan sayilardan(sayi dahil) sadece tek olanlari yazdirin
        Scanner sc= new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi=sc.nextInt();

        while (sayi>0){
            if(sayi%2==1)
            System.out.println(sayi);
            sayi--;


        }

        }

    }
