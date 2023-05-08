package Gun047.task2;

public class Banka {
    public static void main(String[] args) {
        
        //1- bir account sinifi olusturunuz. fieldlari number ve balance (bakiye)
        //2- bir consructor ekleyin
        //3- account sinifina deposit(paraEkle)metodu  ekleyin
        //4-account sinifina withdraw(paraCikar) metodu  ekleyin
        //5- withdraw de 5000 uzerine günlük limit disina ciktiniz uyarisi verelim
        //6- main metodunda account olusturarak ihtimalleri deneyin

        Account account1=new Account();
        account1.deposit(1000);
        System.out.println("account1.balance = " + account1.getBalance());
        account1.withdraw(500);
        System.out.println("account1.balance = " + account1.getBalance());
        // account1.balance=100000;
        System.out.println("account1.balance = " + account1.getBalance());
    }
}
