package gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = {{4, 55}, {45, 6, 77}, {4, 2, 985, 56, 66}, {42, 12, 9}, {4}};


        System.out.println("satır sayısı:" + tablo.length);
        System.out.println("0. satırdaki sutun sayısı:" + tablo[0].length);
        System.out.println("1. satırdaki sutun sayısı:" + tablo[1].length);
        System.out.println("2. satırdaki sutun sayısı:" + tablo[2].length);
        System.out.println("3. satırdaki sutun sayısı:" + tablo[3].length);
        System.out.println("4. satırdaki sutun sayısı:" + tablo[4].length);

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
