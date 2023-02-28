package gun07;

import java.util.Scanner;

public class _14_odev {
    public static void main(String[] args) {
        /*  1- **I love java** olan bir String oluşturun.
        Bu cümlenin toplam karakter sayısını yazdırın. */

        String soru1 = "I love java";
        int karakter = soru1.length();
        System.out.println("karakter = " + karakter);

        /* 2- **Sprint planning** olan bir String oluşturun.
        Bu dizenin _toplam karakter sayısını_ yazdırın. */

        String soru2 = "Sprint planning";
        System.out.println("soru2.length() = " + soru2.length());

        /*3- **apple** olan bir String oluşturun.
        String'in _içinde_ **app** olup olmadığını **doğrula**. */

        String soru3 = "apple";
        System.out.println("soru3.contains(\"app\") = " + soru3.contains("app"));

        /* 4-**orange** kelimesinden oluşan bir String oluşturun.
        String'in **Apple**'a _eşit_ olup olmadığını doğrulayın. */

        String soru4 = "orange";
        System.out.println("soru4 = " + soru4.equals("Apple"));

        /*5-**apple**  olan  bir String oluşturun.String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        _Büyük harf veya küçük harf önemli değildir._ */

        String soru5 = "apple";
        System.out.println("soru5.equals(\"apple\") = " + soru5.equals("apple"));

        /*6-**Florida** kelimesinden bir String oluşturun.
        Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.*/

        String soru6 = "Florida";
        System.out.println("soru6.indexOf(\"o\") = " + soru6.indexOf("o"));

        /*7-**Thank you** olan bir String oluşturun.
        Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.*/

        String soru7 = "Thank you";
        System.out.println("soru7.indexOf(\"y\") = " + soru7.indexOf("y"));

        /*8- **Main method** oluşturun.   **Mouse** değerinde bir String oluştur.
        Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.*/

        String soru8 = "Mouse";
        System.out.println("soru8.charAt(3) = " + soru8.charAt(3));

        /* 9-**paper** olan bir String oluşturun.
        String'i _büyük harfe_ çevirin ve yazdırın.*/

        String soru9 = "paper";
        System.out.println("soru9.toUpperCase() = " + soru9.toUpperCase());

        /*10-**OraNge** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.*/

        String soru10 = "OraNge";
        System.out.println("soru10.toLowerCase() = " + soru10.toLowerCase());

        /*11-**New Jersey** olan bir String oluşturun.
        String'i _büyük harfe_ çevirin ve yazdırın*/

        String soru11 = "New Jersey";
        System.out.println("soru11.toUpperCase() = " + soru11.toUpperCase());

        /*12-**New York** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.*/

        String soru12 = "New York";
        System.out.println("soru12.toLowerCase() = " + soru12.toLowerCase());

        /*13-**PADDLE** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.*/

        String soru13 = "PADDLE";
        System.out.println("soru13.toLowerCase() = " + soru13.toLowerCase());


    }
}
