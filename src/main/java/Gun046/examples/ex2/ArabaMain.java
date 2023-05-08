package Gun046.examples.ex2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba opel=new Araba();

        opel.setRenk("yesil");
        opel.setModel("astra");
        opel.setMotor(1600);
        opel.setKapiSayisi(4);


        Araba Porsche =new Araba("mavi", "por",1400,2);
        Araba toyota =new Araba("kirmizi", "verso",2000,4);

        System.out.println("toyota.getKapiSayisi() = " + toyota.getKapiSayisi());
        System.out.println("Porsche = " + Porsche.getModel());
        System.out.println("Porsche = " + Porsche.getRenk());
        System.out.println("opel = " + opel.getMotor());


    }
}
