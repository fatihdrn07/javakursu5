package gun20;

import java.util.Random;
import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int sayi1=oku.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int sayi2=oku.nextInt();

        int tplm=Sayilartoplam(sayi1,sayi2);
        System.out.println(tplm);
    }
    public static int Sayilartoplam(int s1,int s2){
        int toplam=s1+s2;
        return toplam;
       // AYNISI : return (s1+s2);
    }
}
