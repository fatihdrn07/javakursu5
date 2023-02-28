package gun28._01_Constructor;

public class okul {
    public static void main(String[] args) {

        //1. Yol
        ogrenci ogr1=new ogrenci(); //nesne oluşturma anı
        ogr1.id=1;    // özelliklerin değerini veriyorum
        ogr1.ad="İsmet";
        ogr1.soyad="Temur";
        ogr1.sinifi=5;
        System.out.println("ogr1.ad = " + ogr1.ad);

        //2. Yol
        ogrenci ogr2=new ogrenci(2,"mehmet","yılmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3. Yol
        ogrenci ogr3=new ogrenci(2,"fatih","duran");
        System.out.println("ogr3 = " + ogr3.ad);

    }
}
