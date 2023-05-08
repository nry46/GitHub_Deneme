package Gun036.tasks.Task2;

public class Banka {
    String  name;
    int musteri;
    String adres;



    public Banka(String name, int musteri, String adres) {
       this.name=name;
       this.musteri=musteri;
       this.adres=adres;
    }

    public Banka(String name, int musteri)
    {
       this(name,musteri,"");
    }

    public Banka(String name) {
        this(name,0,"");
    }

    @Override
    public String toString() {
        return "Banka{" + "name='" + name + '\'' + ", musteri=" + musteri + ", adres='" + adres + '\'' + '}';
    }


}
