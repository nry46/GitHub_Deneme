package Gun036.example.example1;

public class JavaConstructors {
    public static void main(String[] args) {
//        // bir nesne olusturup , degerini atadik,
//        Student ogrenci1=new Student();
//        ogrenci1.id=63;
//        ogrenci1.name="ahmet";
//        ogrenci1.surName="kaya";
//        ogrenci1.classRoom=21;


//        // 2. yontem
//        Student ogrenci2=Student.createStudent(63,"ahmet","kaya",21);


        //3.ve esas yöntem  nesne olusturmakve degerlerini atamak.
        Student ogremci3=new Student(2,"yilmaz","Guney",18);

        System.out.println(ogremci3.surName);

        Student ogremci4=new Student(4,"zeynep","toprak");


        Student ogremci5=new Student(4,"zeynep");

        Student ogremci6=new Student(4);

        Student ogremci7=new Student();

        ogremci7.id=7;
        ogremci7.name="veli";
        ogremci7.surName="kara";
        ogremci7.classRoom=11;
    }

}
