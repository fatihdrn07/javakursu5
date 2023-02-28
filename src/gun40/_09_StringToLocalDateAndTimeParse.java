package gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // kulllanıcıdan alınan ve string durumda ki time veya tarih
        // bilgisinin time veya tarih bilgisine çevrilmesi

        long startTime=System.currentTimeMillis(); // kodun performansı

        Scanner oku=new Scanner(System.in);
        System.out.print("tarih giriniz (orn: 25 01 2023) =");
        String srttarih= oku.nextLine();

        // kullanıcının gireceği formata göre format oluşturduk
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formatı bu formata uygun olmalı, parse ile çevirdik.
        LocalDate tarih=LocalDate.parse(srttarih,f);

        System.out.println("tarih = " + tarih.format(f));

        long finishTime=System.currentTimeMillis();
        System.out.println("gecen süre = " + (finishTime-startTime)+" ms");


    }
}
