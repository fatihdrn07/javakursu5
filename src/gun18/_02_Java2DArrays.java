package gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = new int[2][3];// 2x3 kadar 6 adet sayı
        int[][] tablo2 = {
                {2, 3, 4},    //0. satır
                {34, 45, 5}   //1. satır
        };

        for (int i = 0; i < 2; i++) {
            System.out.print(tablo2[i][0]+" "); //her bir satırın 0. elamanı
            System.out.print(tablo2[i][1]+" "); //her bir satırın 1. elemanı
            System.out.print(tablo2[i][2]+" "); //her bir satırın 2. elemanı

            System.out.println();
        }

        for (int satir=0;satir<2;satir++){

            for (int sutun=0;sutun<3;sutun++){
                System.out.print(tablo2[satir][sutun]+" ");
            }
            System.out.println();
        }

    }
}
