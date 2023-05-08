package Gun008;

public class stringReplaceFirst {
    public static void main(String[] args) {

        // replacefirst --> replace ile ayni sadece ilk bulunani degistirir
        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("butun a larin nin degistigi hali = " + text.replace("a","e"));
        System.out.println("ilk bulunan a nin degistigi hali = " + text.replaceFirst("a","e"));

















    }
}
