package gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // birden fazla fonsiyona aynı isim verilebilir.

        int s1 = 4;
        int s2 = 12;
        int s3 = 34;

        int sonuc1 = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);

        System.out.println(sonuc1);
        System.out.println(sonuc2);

        String ad = "Fatih";
        String soyad = "Duran";
        String sonuc3 = toplamBul(ad, soyad);

        System.out.println(sonuc3);
    }

    public static int toplamBul(int s1, int s2) {
        return (s1 + s2);
    }

    public static int toplamBul(int s1, int s2, int s3) {
        return (s1 + s2 + s3);
    }

    public static String toplamBul(String ad, String soyad) {
        return (ad + " " + soyad);
    }
}
