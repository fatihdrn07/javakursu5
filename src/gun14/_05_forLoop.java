package gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sayi= oku.nextInt();
        int capim=1;
        for (int i=1;i<=sayi;i++)
            capim=i*capim;

        System.out.println("capim = " + capim);
    }
}
