package gun10;

import java.util.Scanner;

public class _08_odev {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("3 sayi giriniz:");
        String sayilar= oku.nextLine();

        int boslukindex1=sayilar.indexOf(" ");
        int boslukindex2=sayilar.lastIndexOf(" ");

        String strsayi1=sayilar.substring(0,boslukindex1);
        String strsayi2=sayilar.substring(boslukindex1+1,boslukindex2);
        String strsayi3=sayilar.substring(boslukindex2+1);

        int sayi1=Integer.parseInt(strsayi1);
        int sayi2=Integer.parseInt(strsayi2);
        int sayi3=Integer.parseInt(strsayi3);

        int toplam=sayi1+sayi2+sayi3;

        if (toplam%2==0)
            System.out.println("çift.");
        else
            System.out.println("tek.");





    }
}
