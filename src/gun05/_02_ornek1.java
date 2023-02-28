package gun05;

import java.util.Scanner;

public class _02_ornek1 {
    public static void main(String[] args) {
        //birilen bir adı ekrana yazdırınız
        Scanner okuyucu=new Scanner(System.in);

        System.out.print("adınızı giriniz:");
        String ad=okuyucu.next();  //next() bir kelime okur

        System.out.println("ad = " + ad);



        /*
          okuyucu.next();     -> bir kelime okur
          okuyucu.nextLine(); -> satırın tümünü oku

          okuyucu.nextInt();  -> int değeri okumak için
          okuyucu.nextShort();  -> short değeri okuma için
          okuyucu.nextByte();   -> byte değeri okumak için
          okuyucu.nextLong();   -> long değeri okuma için

          okuyucu.nextFloat();  -> float değeri okuma için
          okuyucu.nextDouble(); -> doublem değeri okuma için
        */



    }
}
