package gun30._01_StaticVariables.ornek1;

public class ogrenci {
    String ad;
    String soyad;
    static String okulAd="Atatürk Ilkokulu";
    //sen bir tanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public ogrenci(String ad, String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulad='" + okulAd + '\'' +
                '}';
    }
}
