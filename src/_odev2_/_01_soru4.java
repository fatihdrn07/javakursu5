package _odev2_;

public class _01_soru4 {
    public static void main(String[] args) {
        //4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
        //`İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10`

        int toplam=0;
        for (int i = 0; i <= 10; i++) {
            toplam=i+toplam;

        }
        System.out.println(toplam);
    }
}
