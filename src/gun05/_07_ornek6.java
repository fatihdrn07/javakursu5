package gun05;

import java.util.Scanner;

public class _07_ornek6 {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner oku=new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        int uzunkenar= oku.nextInt();
        System.out.print("Kisa kenari giriniz: ");
        int kisakenar= oku.nextInt();
        int cevre=uzunkenar+uzunkenar+kisakenar+kisakenar;
        int alan=uzunkenar*kisakenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
