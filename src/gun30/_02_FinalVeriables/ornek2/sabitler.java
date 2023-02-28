package gun30._02_FinalVeriables.ornek2;

public class sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaattekiDakSayisi=60;
    final static int birDakikadakiSanSayisi=60;


    // 2. Yöntem
    public static int hesapla(int gun,int saat,int dak)
    {
        int toplamSaniye=gun
                *birGundekiSaatSayisi
                *birSaattekiDakSayisi
                *birDakikadakiSanSayisi
                +
                saat
                        *birSaattekiDakSayisi
                        *birDakikadakiSanSayisi
                +
                dak
                        *birDakikadakiSanSayisi;
        return toplamSaniye;
    }


}
