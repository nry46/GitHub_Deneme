package Gun046.examples.ex1;

public class kisi {
    String  ad;
    String soyad;
    private int yas;  // private yazmamizin sebebi diger clasttan yasa ulasmasin yani - li yazilmasin hatalarin önüne gecmek icin

    // setter method
    public void setYas(int yas)
    {
        this.yas = Math.abs(yas);

        // 2.yöntem
//        if (yas > 0 ) {
//            this.yas = yas;
//        }
//        else
//        {
//            this.yas = -yas;
//        }
    }

    // getter method
    public int getYas()
    {
        return this.yas;
    }
}
