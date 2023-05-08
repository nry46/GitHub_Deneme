package Gun036.tasks.Task1;

public class Book {


    String name;
    int publishYear;
    String autor;

    public Book(String name,  int publishYear, String author){
        this.name=name;
        this.publishYear=publishYear;
        this.autor=author;

    }
    public Book(String name,  int publishYear ){
//        this.name=name;
//        this.publishYear=publishYear;
//        this.autor="";
        this(name,publishYear,"");

    }
    public Book(String name){
//        this.name=name;
//        this.publishYear=0;
//        this.autor="";
        this(name,0,"");



    }
    // toString metodu deniyor
    public String toString(){
        return  name+" "+publishYear+" "+autor;
    }

    public void ShowInfo(){


        System.out.println(name+" "+ publishYear + " " + autor);
    }
}
