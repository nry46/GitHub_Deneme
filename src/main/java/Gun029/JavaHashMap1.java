package Gun029;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap1 {
    public static void main(String[] args) {

        Map<Integer, Integer> m=new HashMap<>();

        m.put(2,11); // 2. anahtara 11 degeri set edildi
        m.put(3,12);
        m.put(4,13);
        m.put(5,14);
        m.put(2,15); // 2 anahtardaki degeri güncelliyor ilkini yazmiyor.

        System.out.println("m.get(2) " + m.get(2)); // 2. anahtardaki deger alindi m.get(2)=14
        System.out.println("m.keySet() = " + m.keySet()); // anahtar listesi keyler m.kevset() =[2,3,4,5]
        System.out.println("m.values() = " + m.values());// degerler listesi values m.values() =[12,13,14,15]
         System.out.println("m = " + m);  // m= {2=15, 3=12,4=13, 5=14}



        // 2.yöntemler
        for (Integer ky : m.keySet()){
            System.out.println("ky = " + ky);
        }


        for (Integer vl : m.values()) {
            System.out.println("vl = " + vl);

        }

        for (Map.Entry<Integer,Integer> anahtarVeDeger: m.entrySet()){

            System.out.println("anahtarVeDeger.geKety  = " + anahtarVeDeger.getKey()); // bu anahtari veriyor
            System.out.println("anahtarVeDeger.getValue  = " + anahtarVeDeger.getValue()); // bu degeri veriyor
            System.out.println();

        }
        boolean buAnahtarVarmi=m.containsKey(2); //2 seklinde bir anahtar var mi
        boolean buDegerVarmi=m.containsValue(12); //12 seklinde bir deger var mi

        System.out.println("buAnahtarVarmi = " + buAnahtarVarmi);
        System.out.println("buDegerVarmi = " + buDegerVarmi);


        m.remove(2);
        System.out.println(" removeden sonra m = " + m);

        m.clear();
        System.out.println("clear den sonra m = " + m);


    }
}