package Gun031.tasks.task1;

import java.util.ArrayList;

public class task1{

    // create class student with fields:
    // string name ., int not
//    daha sonra 3 tane ogrenci notu oilusturun. ve bu ogrencileri bir arrayliste ekleyin.
//    Daha sonra ogrenci bilgilerini yazdiran bir metod yazarak Arraylist teki öğrenci bilgilerini döngü yazdırınız.
    // Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.


    public static void main(String[] args) {
        Student ogr1=new Student();
        Student ogr2=new Student();
        Student ogr3=new Student();
        ogr1.name="Ahmet";
        ogr1.not= 80;
        ogr2.name="Ayse";
        ogr2.not=90;
        ogr3.name="kaya";
        ogr3.not=65;

        ArrayList<Student> ogrenciler= new ArrayList<>();
        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);
        ogrenciler.add(ogr3);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        BilgiYazdir(ogrenciler);
        ortalama(ogrenciler);



    }
    // 3.kisim
    public static  void  BilgiYazdir(ArrayList<Student>ogrenciler){
        for (Student ogr :ogrenciler) {

            System.out.println("ogr.name = " + ogr.name + " ogrenci notu = " + ogr.not);

        }

    }
    public static void ortalama(ArrayList<Student> ogrenciler){

        int toplam=0;
       double ort=0;
        for (Student ogr:ogrenciler) {

            toplam+=ogr.not;


        }
        toplam/=ogrenciler.size();
        System.out.println("ogrencilerin ortalamasi = " + toplam);
    }


}
// 1.kisim
class Student{
    String name;
    int not;

}