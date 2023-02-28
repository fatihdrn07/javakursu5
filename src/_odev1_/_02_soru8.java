package _odev1_;

public class _02_soru8 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int[] sayilar={5,6,8,12,14,19};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2==0)
                toplam=toplam+sayilar[i];
            else if (sayilar[i]%2!=0) {
                toplam=toplam-sayilar[i];

            }

        }
        System.out.println(toplam);
    }
}
