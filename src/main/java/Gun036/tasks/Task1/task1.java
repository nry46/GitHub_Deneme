package Gun036.tasks.Task1;

public class task1 {
    //bir Book clasi yaziniz. fields. name,publischyear,autor.
    // 3 adet Consructor ekleyin
    // kitaplarin özelliklerini tek satirda yazdiran metod ekleyin
    // 3 adet kitabi farkli constructor la olusturup mainde yazdirin.

    public static void main(String[] args) {
        Book book1=new Book("Mobi Dick",1934,"Herman Marville");
        Book book2=new Book("Suc ve Ceza",1945,"Dostayevski");
        Book book3=new Book("Sefiller",1930,"Victor Hugo");
        Book book4=new Book("Kavgam",1945);
        Book book5=new Book("Vadideki Zambak");

        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();
        book4.ShowInfo();
        book5.ShowInfo();


        // 2. yazdirma yontemi

        System.out.println(book1);// Book1 stringe cevrilmis hali

        System.out.println(book1.toString());// aslinda bunu yapiyor

        System.out.println("book1.name = " + book1.name);


    }
}
