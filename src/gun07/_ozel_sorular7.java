package gun07;

import java.util.Scanner;

public class _ozel_sorular7 {
    public static void main(String[] args) {

        //7- Girilen bir cümlede kaç kelime olduğunuz bulunuz

        Scanner oku=new Scanner(System.in);

        System.out.print("bir cümle giriniz:");
        String text7 = oku.nextLine();
        String bosluk=text7.replaceAll("[^ ]","");//boşluk dışındaki bütün karakterleri sildim
        System.out.println("kelime sayisi: "+bosluk.length()+1);//kelime sayısı boşluk sayısının 1 fazlasıdır


    }
}
