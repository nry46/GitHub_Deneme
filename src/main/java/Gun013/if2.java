package Gun013;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        // kullanicidan fizik:90 not bilgisi aliniz.
      //  >=90 icin  A,  >=80 icin B,, >=70 icin C ,, >=60 icin D,, >=40 icin E ,, <40 icin f yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.print(" Fizik notu  giriniz = ");
        String dersNot= sc.nextLine();

        int ogrNot=Integer.parseInt(dersNot.substring(dersNot.indexOf(" ") +1));
        //int ogrNot = Integer.parseInt(dersNot.replaceAll("[^0-9]", ""));
        if (ogrNot>= 90)
            System.out.println("A");
        else
        if (ogrNot>= 80)
            System.out.println("B");
        else
        if (ogrNot>= 70)
            System.out.println("C");
        else
        if (ogrNot>= 60)
            System.out.println("D");
        else
        if (ogrNot>= 40)
            System.out.println("E");
        else

            System.out.println("F");



















    }
}
