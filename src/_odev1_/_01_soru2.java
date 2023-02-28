package _odev1_;

import java.util.Scanner;

public class _01_soru2 {
    public static void main(String[] args) {
        //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int sayac2=0;
        while (sayac<=6){
            System.out.print(sayac+". sayiyi giriniz:");
            int sayi= oku.nextInt();
            sayac++;
            if (sayi%2!=0)
                sayac2++;
        }
        System.out.println("tek sayı miktarı:"+sayac2);

    }
}
