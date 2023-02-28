package gun16;

import java.util.Scanner;

public class _01_javaDizi {
    public static void main(String[] args) {

        // benim bir tanımlamada BİRDEN FAZLA değer tutabilen bir
        //değişkene ihtiyacım var
        //ÇÖZÜM :

        int[] notlar=new int[50];  // 50 tane not saklayabilen notlar isimli değişken

        notlar[0]=54;
        notlar[1]=87;
        //..
        //...
        notlar[49]=38; // en son eleman toplam eleman sayısı-1 0-49 index dir

        System.out.println("notlar[0] = " + notlar[0]);


        Scanner oku=new Scanner(System.in);
        for (int i=0; i<notlar.length;i++)
        {
            System.out.print("notu giriniz:");
            notlar[i]= oku.nextInt();
        }
        for (int i=0;i<notlar.length;i++)
        {
            System.out.println(notlar[i]);
        }
    }
}
