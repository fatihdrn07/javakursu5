package _odev1_;


import java.util.Scanner;

public class _01_soru4 {
    public static void main(String[] args) {
        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac<=5){
            System.out.print(sayac+". sayiyi giriniz.");
            int sayi= oku.nextInt();
            sayac++;
            if (sayi>10&&sayi<30)
                toplam=toplam+sayi;
        }
        System.out.println("toplam="+toplam);

    }
}
