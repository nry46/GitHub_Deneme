package Gun024;


import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>() {
            {
                add("Almanca");
                add("İngilizce");
                add("Türkce");
                add("Rusca");
            }
        };
        System.out.println("list1 = " + list1);


        ArrayList<String> list2=new ArrayList<>();
        list2.add("türkce");
        list2.add("Rusca");
        list2.add("Arapca");
        System.out.println("list2 = " + list2);

        list1.removeAll(list2);
        System.out.println("list1 = " + list1);



    }
    
}
