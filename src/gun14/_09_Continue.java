package gun14;

import java.util.Scanner;

public class _09_Continue {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker ekrana alt alta
        //olacak şekilde yazdırınız, boşlukları yazmasın

        Scanner oku=new Scanner(System.in);
        System.out.print("bir string giriniz:");
        String text= oku.nextLine();

        int karaktersayisi=text.length();

        for (int i=0;i<karaktersayisi;i++) {

            if (text.charAt(i)==' ')
                continue;

            System.out.println(text.charAt(i));
        }





    }
}
