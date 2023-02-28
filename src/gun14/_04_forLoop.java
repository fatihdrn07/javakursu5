package gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //kullanıcının gireceği bir rakama kadar olan sayıların
        //toplamını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sayi= oku.nextInt();
        int toplam=0;
        for (int i=0;i<=sayi;i++)
            toplam=i+toplam;

        System.out.println("toplam = " + toplam);

    }
}
