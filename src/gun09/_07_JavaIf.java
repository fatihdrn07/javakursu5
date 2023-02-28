package gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen bir cümledeki küçük veya büyük a harfinin olup
        //olmadığını yazdırınız. var yok şeklinde

        Scanner oku = new Scanner(System.in);

        System.out.print("bir cümle giriniz");
        String cumle = oku.nextLine();

        if (cumle.toLowerCase().contains("a"))
            System.out.println("var");
        if (!cumle.toLowerCase().contains("a"))
            System.out.println("yok");


    }
}
