package Gun032.taskk.task1;

public class task1 {
    //1. Adim :Rechtangle isminde bir sinif yaziniz. fields: width,length
    // 2. Adim : tanimladiginiz sinifa getPerimeter isminde cevresini bulan metodu yazin.
    //3 . adim : Diktörtgenin alanini bulan getArea isimli bir meted yaziniz
    public static void main(String[] args) {
        Rechtangle diktortgen=new Rechtangle();
        diktortgen.width=5;
        diktortgen.length=4;
        System.out.println("diktortgen.getPerimeter() = " + diktortgen.getPerimeter());
        System.out.println("diktortgen.getArea() = " + diktortgen.getArea());
    }
    
    
    
}
