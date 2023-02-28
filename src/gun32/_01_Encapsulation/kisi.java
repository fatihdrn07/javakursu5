package gun32._01_Encapsulation;

public class kisi {
    private String ad;  //25 karakter olsun
    private String soyad;
    private int yas;  //korumaya aldık

    void yasAta(int yas){
        if (yas>0&&yas<150)
            this.yas=yas;
        else
            System.out.println("hatalı yaş");
    }
    int yasVer(){
        return this.yas;
    }
    void setSoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("hatalı soyad");
    }
    String getSoyad(){
        return this.soyad;
    }
    void setAd(){
        if (ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatalı ad");
    }
    String getAd(){
        return this.ad;
    }

    public kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
}
