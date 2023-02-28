package gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][]tablo={{3,4,25},{234,22,33}};

        System.out.println("satır uzunluğu:"+tablo.length); // satır sayısı
        System.out.println("0. satırın sutun uzunluğu:"+tablo[0].length); //3 sutun uzunluğu
        System.out.println("1. satırın sutun uzunluğu:"+tablo[1].length); //3 sutun uzunluğu

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");

            }

            System.out.println();
        }
    }
}
