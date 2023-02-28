package gun07;

import java.util.Scanner;

public class _ozel_sorular8 {
    public static void main(String[] args) {

        //8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("bir cümle giriniz: ");
        String text8= oku.nextLine();
        System.out.println(text8.replaceAll("[^ ]",""));


    }
}
