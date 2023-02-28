package gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi   adı   ilk değeri     işlem tamam bu adımı çalıştırır
        int     sayi =   5;

        Scanner okuyucu = new Scanner(System.in);
        //tipi   adı     yeni okuyucu(klayteden konsoldan)

        System.out.print("Sayi giriniz:");
        sayi= okuyucu.nextInt();

        System.out.print("sayi: "+ sayi);



    }
}
