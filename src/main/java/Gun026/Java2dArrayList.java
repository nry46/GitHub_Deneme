package Gun026;

import java.util.ArrayList;

public class Java2dArrayList {
    public static void main(String[] args) {
        /***********************/
        int sayi=5; // tek bir rakam saklayabilen değişken
        int[] dizi=new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] mat2=new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<Integer> arrList=new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
        /***********************/


        int[][] mat=new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<  ArrayList<Integer>  >  notlarArrList = new ArrayList<>();
        // boşluklar gereksi sade gözükebilsin diye yapıldı.

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar=new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar); // burada tanımalamada neyin listesi ise ona uygun değişkeni Ekledik
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);

//
//        for (int i = 0; i <matNotlar.size() ; i++) {
//            System.out.println("matNotlar = " + matNotlar.get(i));
//        }
        // get i nin j si = i bana defterdeki yaprak  j de yapraktaki not verir
        System.out.println("notlarArrList.size = " + notlarArrList.size());
        for (int i = 0; i <matNotlar.size() ; i++) { //otlarArrList.size() : defterde ki derslerin notlistesinin kac tane oldugunu , yaprak sayisi


            for (int j = 0; j < notlarArrList.get(i).size(); j++) {  // notlarArrList.get(i).size():1 yapraktaki not sayisi
                System.out.println("notlarArrList = " + notlarArrList.get(i).get(j));

            }

        }
        // bana öyle bir metod yazin ki metoda dersin nosunu gönderecegim  bana ortalamasini verecek

        

    }
}
