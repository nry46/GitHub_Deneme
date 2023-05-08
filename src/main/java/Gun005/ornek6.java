package Gun005;

public class ornek6 {

    public static void main(String[] args) {
        
        
        // sayilar arasi donüsüm
        int  sayi = 5;
        double rakam= 55.67;
        
        rakam = sayi; // otomatik rakam = (double) sayi;
         sayi =(int)rakam; // manuel
        
        // sayiyi srtinge cevirme
        String yazi = Integer.toString(sayi);
        String yazi2 = Double.toString(rakam);

        System.out.println("yazi2 = " + yazi2);
        System.out.println("yazi = " + yazi);

        // stringden sayiya cevirme
        
        String yaziIle= "20";
        int rakamhali=Integer.parseInt((yaziIle));
        int toplam=rakamhali +sayi;
        System.out.println("toplam = " + toplam);
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
