package gun27._03_ornek;

public class soru {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
    // 2- Student: fields : name, maxSaat, dersleri adında derslerini
    // listesini tutacak bir liste.
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Saati geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
    // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod
    //    ekleyinız.en basta yazdırınız.

    public static void main(String[] args) {

        lesson ders1=new lesson();
        ders1.name="algoritma";
        ders1.saat=4;

        lesson ders2=new lesson();
        ders2.name="java";
        ders2.saat=4;

        lesson ders3=new lesson();
        ders3.name="test tools";
        ders3.saat=3;


        student ogr1=new student();
        ogr1.name="fatih";
        ogr1.maxsaat=10;
        ogr1.dersekle(ders1);
        ogr1.dersekle(ders2);
        ogr1.dersekle(ders3);
        ogr1.dersleriYazdir();





    }
}
