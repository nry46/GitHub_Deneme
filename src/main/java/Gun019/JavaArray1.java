package Gun019;

import java.util.Scanner;

public class JavaArray1 {
    public static void main(String[] args) {

        // kullanıcıdan alacağınız 5 adet sayıyı girişi sırasına göre tersten yazdırınız.



//        Scanner sc = new Scanner(System.in);
//        int[] dizi = new int[5];
//
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.print("bir sayi giriniz=");
//            dizi[i] = sc.nextInt();
//        }
//
//
//        for (int j = 4; j >= 0; j--) {
//            System.out.print(dizi[j]);
//        }



        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5]; // 5 tane ama , oda numarası 0,1,2,3,4

        for(int i=0;i<dizi.length;i++)
        {
            System.out.print("Sayı giriniz=");
            dizi[i]=oku.nextInt();
        }

        // tersten demek indexleri sondan başa doğru ilerletmek demek
        // 4,3,2,1,0
        for(int i=dizi.length-1; i>=0; i--)  // 4 yerine dizi.length-1 yazılabilir.
        {
            System.out.println("Sayi = "+ dizi[i]);
        }
    }
    }

