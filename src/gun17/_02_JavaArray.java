package gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç
        // kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz:");
        String text= oku.nextLine();

        int sayac=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==' ')
                sayac++;



        }
        System.out.println("kelime sayisi:"+(sayac+1));

    }
}
