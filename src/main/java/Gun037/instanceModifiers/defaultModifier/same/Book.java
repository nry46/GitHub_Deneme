package Gun037.instanceModifiers.defaultModifier.same;

public class Book {
    String name;
    Book(){// default access modifier

    }
    public Book(String  name){// public
        this.name=name;
    }
    Book kitap2=new Book("kirik testi");
    // Yni pakette hem default hemde publici cagirdik. sikinti tinne.
}
