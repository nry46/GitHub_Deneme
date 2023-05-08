package Gun008;

public class StringReplace {

    public static void main(String[] args) {
        // Replace : bir  stringin icerisinde ki istenen  karakterkeri hepsini verilen yenisi ile degistirir.

        String text = "Merhaba Dünya";
        System.out.println("orjinal hali = " + text);
        System.out.println(" a lari e olarak degistirilmis hali = " + text.replace('a', 'e' ));
        System.out.println(" ba  de hali = " + text.replace("ba", "de"));
        System.out.println(" Dünva   -> Java degismis hali = " + text.replace("Dünya", "Java"));























    }


















}
