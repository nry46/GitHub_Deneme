package Gun013;

import java.util.Scanner;

public class switch5 {
    public static void main(String[] args) {

//girilen bir sayinin onlar basamaginin degerini yazi ile yazdirin.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Bir sayi giriniz = ");
        int sayi= sc.nextInt();

        int onlarBasamagi= (sayi/10)%10;

        switch (onlarBasamagi){
            case 0: System.out.println("Sifir");
                break;
            case 1: System.out.println("Bir");
            break;
            case 2: System.out.println("iki");
                break;
            case 3: System.out.println("üc");
                break;
            case 4: System.out.println("dört");
                break;
            case 5: System.out.println("Bes");
                break;
            case 6: System.out.println("alti");
                break;
            case 7: System.out.println("yedi");
                break;
            case 8: System.out.println("sekiz");
                break;
            case 9: System.out.println("dokuz");
                break;















        }












    }
}
