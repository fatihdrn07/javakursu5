package gun17;

import java.util.Scanner;

public class _04_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir stringi parçalara ayırmak demek

        // kullanıcıdan alacağınıız cümleyi kelimelerine göre alt
        // alta yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle:");
        String cumle=oku.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);

        }


    }
}
