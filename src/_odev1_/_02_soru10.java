package _odev1_;

public class _02_soru10 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] sayilar={14,19,5,21};
        int enkucuk=sayilar[1];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]<enkucuk)
                enkucuk=sayilar[i];
        }
        System.out.println(enkucuk);
    }
}
