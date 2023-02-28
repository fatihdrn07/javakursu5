package gun32._03_Encapsulation;

import java.util.ArrayList;

public class okul {
    private String okulAd;
    private int kontenjan;
    private ArrayList<ogrenci> ogrenciler=new ArrayList<>();

    public okul(String okulAd, int kontenjan) {
       setKontenjan(kontenjan);
       setOkulAd(okulAd);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
