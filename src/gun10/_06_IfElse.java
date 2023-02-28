package gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("şifre giriniz:");
        String passwort= oku.nextLine();
        int uzunluk=passwort.length();
        if (uzunluk>8 && uzunluk<12 && passwort.contains("pass")==false)
            System.out.println("uygun şifre.");
        else
            System.out.println("uygun olmayan şifre.");


    }
}
