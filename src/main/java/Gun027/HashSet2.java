package Gun027;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red");// bunu tekrar oldugu icin eklemedi
        hs.add("red");
        hs.add("rED");
        hs.add("mor");
        hs.add("Sa");
        // 1.yol
        System.out.println("hs = " + hs);

        //2. yol


        for (String s : hs) {
            System.out.println("s = " + s);


            //3.Yol
            Iterator gosterge = hs.iterator();
            while (gosterge.hasNext()) // sonraki varsa
            {
                System.out.println("Sonraki eleman = " + gosterge.next());
            }


        }
        hs.remove("red"); // bir elemani siler
        System.out.println("remove sonrasi hs = " + hs);


        hs.clear(); // set i siler
        System.out.println(" clear sonrasi hs = " + hs);


    }}
