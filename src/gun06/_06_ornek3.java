package gun06;

import java.util.Scanner;

public class _06_ornek3 {
    public static void main(String[] args) {
        // girilen bir ad soyadı "Fatih Duran"
        //F.D. şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Ad Soyad:");
        String isim= oku.nextLine();

        char ilkharf=isim.charAt(0);
        int boslukindex=isim.indexOf(" ");
        char soyadilkharf=isim.charAt(boslukindex+1);

        System.out.println(ilkharf+"."+soyadilkharf+".");

        //char soyadilkharf=isim.charAt(isim.indexOf(" ")+1);
    }
}
