package gun17;

public class _03_CharVeSayi {
    public static void main(String[] args) {

        int sayi = 65;

        char harf = (char) sayi;
        System.out.println(harf);


        for (int i = 0; i <= 255; i++) {

            harf = (char) i;
            System.out.println(i + ". harf= " + harf);

        }


    }
}
