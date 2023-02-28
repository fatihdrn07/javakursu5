package gun06;

import java.util.Scanner;

public class _04_ornek2 {
    public static void main(String[] args) {
        //girilen bir stringin son harfini yazdırın

        Scanner oku=new Scanner(System.in);

        System.out.print("Cumle giriniz:");
        String cumle= oku.nextLine();
        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);

        System.out.println("sonharf = " + sonharf);


        //ikinci yöntem
        System.out.println("son harf " + cumle.charAt(cumle.length()-1));

    }
}
