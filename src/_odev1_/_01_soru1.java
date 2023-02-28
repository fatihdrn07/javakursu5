package _odev1_;

import java.util.Scanner;

public class _01_soru1 {
    public static void main(String[] args) {
        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        while (sayac<=4){
            System.out.print(sayac+". sayiyi giriniz:");
            int sayi= oku.nextInt();
            sayac++;
            if (sayi%2!=0)
                toplam=toplam+sayi;
        }
        System.out.println("toplam:"+toplam);


    }
}
