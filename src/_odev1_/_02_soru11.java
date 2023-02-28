package _odev1_;

public class _02_soru11 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] sayilar={12,2,5,15,8};
        int enbuyuk=0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>enbuyuk)
                enbuyuk=sayilar[i];
        }
        System.out.println(enbuyuk);
    }
}
