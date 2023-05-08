package Gun036.example.example1;
// bit tür yapisi: Class
public class Student {
    int id;
    String name;
    String surName;
    int classRoom;





// 2. yontem icin
//    public static Student createStudent(int id, String name,String surName, int classRoom){
//
//        Student ogrenci2=new Student();
//        ogrenci2.id=id;
//        ogrenci2.name=name;
//        ogrenci2.surName=surName;
//        ogrenci2.classRoom=classRoom;
//
//        return ogrenci2;
//    }
    public  Student (int id, String name,String surName, int classRoom){

        this.id= id;
        this.name=name;
        this.surName= surName;
        this.classRoom= classRoom;
    }
    public  Student (int id, String name,String surName){
// this : clasin kendisini gösteriyor yani student i gösteriyor
        this.id= id;
        this.name=name;
        this.surName= surName;
        this.classRoom= 0;
    }

    public  Student (int id, String name){

        this.id= id;
        this.name=name;
        this.surName= "";
        this.classRoom= 0;
    }

    public  Student (int id){

        this.id= id;
        this.name="";
        this.surName= "";
        this.classRoom= 0;
    }
    public  Student (){

        this.id= 0;
        this.name="";
        this.surName= "";
        this.classRoom= 0;
    }
}
