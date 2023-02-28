package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_soru {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random(10 dahil) olarak doldurduktan sonra
        //kullanıcının gireceği bir rakamı arattırınız bu rakam var ise
        //indexini yazdırınız

        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*11);
        }
        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10): ");
        int arananRakam= oku.nextInt();

        boolean bulundu=false;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]==arananRakam){
                bulundu=true;
                System.out.println("Bulundu index: "+i);

            }

        }
        if (!bulundu)
            System.out.println("Bulunamadı");


    }
}
