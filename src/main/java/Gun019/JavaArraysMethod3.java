package Gun019;

import java.util.Arrays;

public class JavaArraysMethod3 {
    public static void main(String[] args) {
// Arrays.toString(Array) -> dizinini bütün elamanlarını yazdırır.
        String[] names = {"ahmet", "ayşe", "kaya", "deniz"};
        System.out.println(".toString:" + Arrays.toString(names));

        //Arrays.sort(array) diziyi sıralar
        Arrays.sort(names);
        System.out.println(".sort :" + Arrays.toString(names));

        //Arrays.equals(array1,array2) -> Bütün elemanların sırası ile aynı olup
        // olmadığını kontrol eder
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 1, 3};

        System.out.println("a==b " + Arrays.equals(a, b)); // true
        System.out.println("a==c " + Arrays.equals(a, c)); // false

        //Arrays.fill(array, value); bütün elemanlara value değerini atar
        int[] numbers = new int[5];
        System.out.println("atamadan önce değerler:" + Arrays.toString(numbers));
        Arrays.fill(numbers, 7);
        System.out.println("atamadan sonra değerler:" + Arrays.toString(numbers));

        // Arrays.binarySearch(array, value) SIRALI bir dizide aranan değer var ise
        // index ini veriri, yok ise - değer döndürür.
        int[] rakamlar = {2, 3, 7, 4, 13, 8, 8, 8, 8, 12, 6};
        System.out.println("önce : 8 in ind= " + Arrays.binarySearch(rakamlar, 8));
        Arrays.sort(rakamlar);
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        System.out.println("sonra : 8 in ind= " + Arrays.binarySearch(rakamlar, 8));


        int[] nums = {6, -4, 12, 0, -10};
        int x=12;
        int y=Arrays.binarySearch(nums,x);
        System.out.println("y = " + y);


    }
}

