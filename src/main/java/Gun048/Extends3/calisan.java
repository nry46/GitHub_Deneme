package Gun048.Extends3;


public class calisan  {
    private String isim;
    protected double maas; // bu sınıftan türetilenler ulaşabilir
    int maasKatsayisi;

    public calisan(String ismi, double maas, int maasKatsayisi) {
        this.isim = ismi;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public double maasHesapla()
    {
        return this.maas* this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
