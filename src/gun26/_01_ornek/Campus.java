package gun26._01_ornek;

public class Campus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Fatih Duran";

        // 1. Yöntem
        ogr.okulu=new Okul();
        ogr.okulu.adi="Mehmet Akif Ersoy";
        ogr.okulu.mudurAdi="İsmet Temur";
        ogr.okulu.ucreti=10000;

        // 2. Yöntem
        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy";
        ok.mudurAdi="İsmet Temur";
        ok.ucreti=10000;
        ogr.okulu=ok;

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("okul adi = " + ogr.okulu.adi);
        System.out.println("okul mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("okul ucreti = " + ogr.okulu.ucreti);
    }
}
