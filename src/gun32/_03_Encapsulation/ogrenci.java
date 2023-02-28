package gun32._03_Encapsulation;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class ogrenci {
    private int id;
    private String ad;
    private String soyad;
    private int yas;
    static int sayacID=1;

    public ogrenci( String ad, String soyad, int yas) {
       setId(sayacID++);
       setYas(yas);
       setAd(ad);
       setSoyad(soyad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
