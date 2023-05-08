package Gun011;

import java.util.Scanner;

public class ifElse7 {
    public static void main(String[] args) {
//  bir otopark ucret hesaplama programi yapilmak isteniyor 0-2 saat arasi 5 tl, 2-5 arasi 10 , 5 saatten sonra 15 tl
        // saat girildiginde ucreti yazdirin

        Scanner sc= new Scanner(System.in);
        System.out.print(" kac saat kaldiniz = ");
        int saat = sc.nextInt();


        if(saat<=2)
            System.out.println("5 Euro");
         else
             if(saat<=5)

                 System.out.println("10 Euro");
             else
                 System.out.println("15 Eoro");
































    }
}
