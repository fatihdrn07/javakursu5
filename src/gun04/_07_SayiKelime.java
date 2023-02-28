package gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // şu ana akadar sayıları birbirine çevirdik.
        // yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi var.

        String ad="Fatih";
        String kelimesayi="65"; //string halde, toplama gibi bir işleme girmez

        int sayideger=Integer.parseInt(kelimesayi); //sayiya dönüşür.

        int toplam=sayideger+sayideger;
        System.out.println("toplam = " + toplam);

        //toplam şu anda int yani sayi, bunu string nasıl dönüştürürüm
        String strToplam=Integer.toString(toplam); //string e dönüşür
        System.out.println("strToplam = " + strToplam);



    }
}
