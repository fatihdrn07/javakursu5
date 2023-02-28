package gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        int[][] tablo = new int[2][3];
        int enBuyuk =tablo[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i + ". satırı" + j + ". sutunu giriniz: ");
                Scanner oku = new Scanner(System.in);
                tablo[i][j] = oku.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablo[i][j] > enBuyuk)
                    enBuyuk = tablo[i][j];
            }
        }
        System.out.println("En büyük sayi: " + enBuyuk);


    }
}
