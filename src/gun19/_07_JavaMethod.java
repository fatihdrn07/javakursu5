package gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);

        //kullanıcıdan sayı alarak onun tek mi çift mi yazdıralım

        tekMiCiftmiOku();
    }
    public static void tekMiCiftMi(int sayi){

        if (sayi%2!=0)
            System.out.println("tek");
        else
            System.out.println("çift");
    }
    public static void tekMiCiftmiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        int sayi= oku.nextInt();

       tekMiCiftMi(sayi);

    }
}
