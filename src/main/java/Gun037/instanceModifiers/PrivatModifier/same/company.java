package Gun037.instanceModifiers.PrivatModifier.same;

public class company {
    public static void main(String[] args) {

        person personel=new person();
        personel.id=1;
        personel.name="ahmet";
        personel.surName="Ahmet";
     //  personel.password="1235"; // giger classta private yapinca password kizardi
        //burasi private oldugunda direk erisilmez.


personel.sifreBelirle("1234abcd");
personel.sifreGoster();




    }
}
