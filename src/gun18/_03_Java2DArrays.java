package gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayilarla
        // doldurunuz. doldurma işlemi bitirdikten sonra
        // yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] sayilar = new int[2][3];
        int sayac = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sayilar[i][j] = (int) (Math.random() * 100);
                if (sayilar[i][j] % 2 != 0)
                    sayac++;
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sayilar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Tek sayi miktari: " + sayac);

    }
}