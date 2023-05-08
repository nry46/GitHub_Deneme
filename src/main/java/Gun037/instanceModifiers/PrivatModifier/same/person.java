package Gun037.instanceModifiers.PrivatModifier.same;

public class person {
    int id;
    String name;
    String surName;
   private   String password;

   public  void sifreBelirle(String sifre){

       if (sifre.length()>=8){
           this.password=sifre;

       }else
           {
               System.out.println("en az 8 karakter olmali");
       }
   }
public  void sifreGoster(){
       if (this.password !=null){

           System.out.println("****"+this.password.substring(4));
}}

}
