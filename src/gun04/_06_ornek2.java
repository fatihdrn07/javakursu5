package gun04;

public class _06_ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double kilo = 78.5;
        int boy = 180;
        double endeks = kilo / (boy * boy);

        System.out.println("kilo = " + kilo);
        System.out.println("boy = " + boy);
        System.out.println("endeks = " + endeks);


    }
}
