package gun05;

import java.util.Scanner;

public class _06_ornek5 {
    public static void main(String[] args) {
        //bir karenin kenar uzunluğunu kullanıcıdan alıp
        //alan ve çevreyi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("karenin 1 kenarının uzunluğunu giriniz: ");
        int kenar=oku.nextInt();
        int cevre=kenar*4;
        int alan=kenar*kenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
