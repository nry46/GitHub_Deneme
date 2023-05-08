package Gun043.JavaExeption;

public class JavatryCatch5 {
    public static void main(String[] args) {
        String str="";
        int a=5;
        int b=0;
        int c=0;

        //char ilkHarf=str.charAt(0);



        try {
            System.out.println("1. adim");
            char ilkHarf=str.charAt(0);
            System.out.println("2. adim");
            c=a/b;
            System.out.println("3. adim");
//        }
//        catch (Exception ex)
//        {
//            System.out.println("4. adim");
//            System.out.println("hata: String dizisinin dizisini siniri asildi. ");
//        }
//
//
//        System.out.println("5. adim");
//
        }
        catch (StringIndexOutOfBoundsException ex)
        {
            System.out.println("4. adim");
            System.out.println("hata: String dizisinin dizisini siniri asildi. ");
        }


        System.out.println("5. adim");





    }
}
