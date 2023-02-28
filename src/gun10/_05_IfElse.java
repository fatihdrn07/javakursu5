package gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir string giriniz:");
        String kelime= oku.nextLine();
        int uzunluk=kelime.length();

        if (uzunluk>10 && kelime.contains("study")==true)
            System.out.println("evet");
        else
            System.out.println("hayır");


    }
}
