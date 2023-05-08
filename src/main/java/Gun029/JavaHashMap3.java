package Gun029;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaHashMap3 {
    public static void main(String[] args) {

// HashMap, LinkedHashMap, TreeMap
        
        //Hash algoritmasina gore sakladi
        Map<Integer, String> hm=new HashMap<>();
        hm.put(9, " katze");
        hm.put(7, " hahn");
        hm.put(25, " kuh");
        hm.put(18, " hund");
        hm.put(6, " löve");
        hm.put(12, " hase");
        System.out.println("hm = " + hm);// hm = {18= hund, 6= löve, 7= hahn, 9= katze, 25= kuh, 12= hase}


        //ekleme sirasina göre

        Map<Integer, String> lm=new LinkedHashMap<>();
        lm.put(9, " katze");
        lm.put(7, " hahn");
        lm.put(25, " kuh");
        lm.put(18, " hund");
        lm.put(6, " löve");
        lm.put(12, " hase");
        System.out.println("lm = " + lm);


        //keyleri baz alarak harf veya rakamlari kücükten buyuge siralar
        Map<Integer, String> tm=new TreeMap<>();
        tm.put(9, " katze");
        tm.put(7, " hahn");
        tm.put(25, " kuh");
        tm.put(18, " hund");
        tm.put(6, " löve");
        tm.put(12, " hase");
        System.out.println("tm = " + tm);

    }
}
