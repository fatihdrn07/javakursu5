package gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayıdan sadece pozitif olanlarının toplamını yazınız

        Scanner oku=new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        while (sayac<20){
            sayac++;
            System.out.print(sayac+". sayiyi giriniz:");
            int sayi= oku.nextInt();
            if (sayi>0){
                toplam=toplam+sayi;
            }
        }
        System.out.println("toplam="+toplam);

    }
}
