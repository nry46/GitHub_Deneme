package Gun016;

public class GununSorusu9 {
    public static void main(String[] args) {
        // 1 ile 255 e kadar olan harflerin  sayi ve harf degerini ekrana yazdirin.

        for (int i = 1; i <= 255; i++) {
            char c = (char) i;
            System.out.println(i + " - " + c);
        }
        int i = 0;
        while (i < 255) {
            char c = (char) i;
            System.out.println(i + " - " + c);
            i++;
        }
    }
}

