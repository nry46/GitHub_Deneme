package Gun047.task1;

import java.util.ArrayList;

public class okul {
    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<ogrenci> ogrenciler=new ArrayList<>();

    public okul(String okulAd, int maxOgrenciSayisi) {
        setOkulAd(okulAd);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}
