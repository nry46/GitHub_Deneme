package Gun024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(65);
        numbers.add(30);
        numbers.add(80);
        numbers.add(75);

        System.out.println(" sirali degil : " + numbers);
        // siralama yapmak icin Collection
        Collections.sort(numbers);
        System.out.println("sirali = " + numbers);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // en buyugu bulma
        int max=Collections.max(numbers);
        int min=Collections.min(numbers);
        System.out.println("en buyuk : " + max);
        System.out.println("en kucuk sayi : " + min);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        // listeyi tersine cevirme
        Collections.reverse(numbers);
        System.out.println("ters cevirmis hali ; "+numbers);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        //bütün elemanlara  bir değer atama.
        Collections.fill(numbers,101);
        System.out.println("fill den sonra = " + numbers);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        //belli bir değer sahip elemanları yenisi ile değiştirir
        Collections.replaceAll(numbers, 101, 5);
        System.out.println("replaceAll dan sonra = " + numbers);







    }
}
