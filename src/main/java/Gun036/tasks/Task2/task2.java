package Gun036.tasks.Task2;

public class task2 {
    public task2() {
    }

    // bir banka classi tanimla
    //3 adet field ekle
    // 3 adet constrotur ekle
    // toString metodu olusturun
    //3 tane nesne olusturup mainde yaazin
    public static void main(String[] args) {
        
        Banka banka1=new Banka("Sparkasse",25000, "krefeld");
        Banka banka2=new Banka("Volks",10000, "köln");

        System.out.println("banka1 = " + banka1);

        System.out.println("banka2 = " + banka2);
        
    }
}
 