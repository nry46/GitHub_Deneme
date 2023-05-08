package Gun027;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedHashSetTreeSet4 {
    public static void main(String[] args) {

        // HashSet, LinkedHashSet, TreSet
        // Hash algoritmasına bağlı sıralamaya göre saklar
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");

        System.out.println("hs = " + hs);

        // Eklenme sırasına göre
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //Alafabetik soraya göre her eklemede saklar
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);



        // sayisal siralamaya gore ekleme saklama yapar
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(1);
        ts2.add(15);
        ts2.add(18);
        ts2.add(13);
        ts2.add(7);
        System.out.println("ts = " + ts2);








    }
}
