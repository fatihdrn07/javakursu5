package gun34._04_Polymorphism_Soru;

public class kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
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

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void KimlikBelgesiYaz(kisi gelenKisi){
        System.out.println("\n***** Kimlik Belgesi *****");
        System.out.println("Adı= "+gelenKisi.ad);
        System.out.println("Soyadı= "+gelenKisi.soyad);
        System.out.println("Görevi= "+gelenKisi.gorevi);
        // şubeyi de öğrenciyse
        // departmanı da calışansa

        if (gelenKisi instanceof ogrenci) // bu gelen kişi öğrenci mi
        {
            // şubeyi yazacağız
            System.out.println("Şubesi= "+ ((ogrenci)gelenKisi).getSubesi());
        }
        if (gelenKisi instanceof Calisan) // gelen kişi calışan mı
        {
            // departmanı yazacağız
            System.out.println("Departmanı= "+((Calisan)gelenKisi).getDepartmani());

        }
    }
}
