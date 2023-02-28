package gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("kaç saat kaldınız? :");
        int sure = oku.nextInt();
        if (sure <= 3)
            System.out.println("borcunuz 10 TL");
        else if (sure <= 5)
            System.out.println("borcunuz 15TL");
        else
            System.out.println("borcunuz 20 TL");

    }
}
