package _odev1_;

public class _02_soru2 {
    public static void main(String[] args) {
        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"

        String text = "Hello World";

        for (int i = text.length(); i >= 0; i--) {
            System.out.println(text.charAt(i));

        }

    }
}
