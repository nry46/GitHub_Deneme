package Gun032.taskk.task2;

public class ElectricityAccount {

    int totalKv=0;
    double rate=0.7;
    double bill;

    void tuketimEkle(int tuketim){
        totalKv+=tuketim;
    }
    double totalBill(){
        bill=rate*totalKv;
        return bill;
    }
}
