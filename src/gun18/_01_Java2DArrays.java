package gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int[][] tumDersNotlari = new int[3][50];
        //3 tane ders 50 tane öğrenci, 150 tane sayı
        //3 satır 50 sütun
        //0.satır  ,  1.satır  ,  2.satır
        //satır : 0,1,2  sütun : 0,1,2,3,4,5,....,49

        tumDersNotlari[0][0] = 80;
        //2 boyutlu dizide 0. satırın 0. sütununa 80 değeri atandı

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0] = oku.nextInt();
    }
}
