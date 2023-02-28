package gun34._04_Polymorphism_Soru;

public class okulMain {
    public static void main(String[] args) {
        ogrenci ogr=new ogrenci("fatih","duran","öğrenci","8/C");
        Calisan cal=new Calisan("ismet","temur","ogretmen","yazılım");

        kisi.KimlikBelgesiYaz(ogr);
        kisi.KimlikBelgesiYaz(cal);
    }
}
