package gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // girilen bir cümlede a harfinin geçip geçmediğini bulunuz
        //geçiyor ise evet geçmiyor ise hayır yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("bir cümle/kelime yazınız:");
        String cumle = oku.nextLine();
        if (cumle.contains("a"))
            System.out.println("evet");
        if (!cumle.contains("a"))
            System.out.println("hayır");

        // 2. yol
        // if (cumle.indexOf("a") != -1)
        //    System.out.println("evet");
        // if (cumle.indexOf("a") == -1)
        //    System.out.println("hayır");

        // 3. yol
        boolean varmi = cumle.contains("a");
        if (varmi == true)
            System.out.println("evet");
        if (varmi == false)
            System.out.println("hayır");


    }
}
