package Gun049.task1;

public class GeometriMain {
    public static void main(String[] args) {
        Diktortgen dd=new Diktortgen(4,5);
        System.out.println("dd = " + dd);// oto toString calisir

        Kare kr=new Kare(6,6);
        System.out.println("kare  = " + kr);
        
        Cember cember=new Cember(3);
        System.out.println("cember = " + cember);// alan yok burda
        System.out.println("cember.getAlan() = " + cember.getAlan());
        
    }
}
