package _odev1_;

public class _02_soru1 {
    public static void main(String[] args) {
        // Bu String'i oluşturun. "Removes white space from both ends of a string"
        // String'deki kelime sayısını yazdırınız.

        String text="Removes white space from both ends of a string";
        int sayac=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==' ')
                sayac++;
        }

        System.out.println(sayac+1);

    }
}
