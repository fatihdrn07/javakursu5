package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][]tablo=new int[3][2];
        int tekmiktar=0;
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("sayi giriniz:");
                tablo[i][j]=oku.nextInt();
                if (tablo[i][j]%2!=0)
                    tekmiktar++;
            }
        }
        int[]tektablo=new int[tekmiktar];

        tekmiktar=0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {

                if (tablo[i][j] % 2 != 0){
                    tektablo[tekmiktar]=tablo[i][j];
                    tekmiktar++;
                }
            }
        }
        System.out.println(Arrays.toString(tektablo));
    }
}
