package gun08;

import java.util.Scanner;

public class _07_ornek4 {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("cümle giriniz:");
        String kelime= oku.nextLine();


        int boslukindex=kelime.indexOf(" ");
        String ilkkelime=kelime.substring(0,boslukindex);
        System.out.println("ilkkelime = " + ilkkelime);



    }
}
