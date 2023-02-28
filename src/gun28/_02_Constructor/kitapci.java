package gun28._02_Constructor;

public class kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {

        book kitap1=new book();
        kitap1.name="yüzüklerin efendisi";
        kitap1.author="tolkien";
        kitap1.publishYear=1954;

        book kitap2=new book("ben robot",1950,"isaac asimov");

        book kitap3=new book("üzüm ve çay",2000);

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);


    }
}
