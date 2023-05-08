package Gun031.example.Ex1;

public class ex1 {
    // ayri bir dosyada student class tanimlayiniz; fields, name, grade

    public static void main(String[] args) {

        student ogrenci1= new student();

        ogrenci1.name="Ayşe";
        ogrenci1.grade=3;

        //1.Yöntem
        school okulu=new school();
        okulu.adress="göztepe";
        okulu.name="Marmara Üniversitesi";
        okulu.principalName="Rektör";
        okulu.tuitionFees=0;

        ogrenci1.schoolInfo=okulu;

        //2.Yöntem
        ogrenci1.schoolInfo = new school();
        ogrenci1.schoolInfo.adress="göztepe";
        ogrenci1.schoolInfo.name="Marmara Üniversitesi";
        ogrenci1.schoolInfo.principalName="Rektör";
        ogrenci1.schoolInfo.tuitionFees=0;


        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);


    }


}
