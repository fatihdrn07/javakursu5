package gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrnot1 = 98;
        byte ogrnot2 = 98;
        byte ogrnot3 = 100;
        byte ogrnot4 = 98;


        int toplam = ogrnot1; //byte-->int atınca problem çıkmadı(GENİŞLEME - Widening Casting)
        //çünkü byte için ayrılan hafıza zaten inte sığar, sığdığı için kabul ederim.
        //çünkü veri kaybı olma ihtimali hiç yok

        ogrnot1 = (byte) toplam; //int-->byte atınca dur bakalım dedi(DARALTMA - Narrow Casting)
        //büyük hafıza ayrılmış bir alanı, küçük alana atma işlemi var.
        //veri kaybı ihtimali var.

    }
}
