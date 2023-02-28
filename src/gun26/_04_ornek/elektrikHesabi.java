package gun26._04_ornek;

public class elektrikHesabi {
    int toplamtuketim=0;
    double birimfiyat=0.7;
    double fatura=0;

    public void tuketimekle(int ayliktuketim){
        toplamtuketim+=ayliktuketim;
    }

    public void toplamtuketimyaz(){
        System.out.println("toplam tüketim"+toplamtuketim);
    }

    public void faturaYaz(String isim){
        double fatura=toplamtuketim*birimfiyat;
        System.out.println("***************");
        System.out.println("     Faturanız");
        System.out.println("***************");
        System.out.println("Müşteri= "+isim);
        System.out.println("Toplam Tüketim= "+toplamtuketim);
        System.out.println("Toplam Tutar= "+Math.round(fatura));
        System.out.println("***************");

    }
}
