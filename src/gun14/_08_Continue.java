package gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //kullanıcıdan 5 sayı isteyiniz
        //bu sayılardan 6 ile 10 arasındakiler hariç diğerlerini toplasın
        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i=0;i<5;i++){
            System.out.print("bir sayi giriniz:");
            int sayi= oku.nextInt();

            if (sayi>6&&sayi<10)
                continue; //calistiği anda kendinden sonra gelen komutları
            //pas gecer

            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);
    }
}
