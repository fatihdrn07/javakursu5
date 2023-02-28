package gun27._01_ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        int sayi=345;
        String srtSayi=String.valueOf(sayi);
        int intSayi=Integer.parseInt(srtSayi);


        Utility ut=new Utility();
        String strSayi2= ut.getString(sayi);

        // Static metodlar zaten var oldukları için
        // new ile yeni oluşturulmaya ihtiyac duymazlar
        String strSayi3=Utility.getString2(sayi);
    }
}
