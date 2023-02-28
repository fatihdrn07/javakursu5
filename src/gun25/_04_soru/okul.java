package gun25._04_soru;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        Scanner okuint=new Scanner(System.in);
        Scanner okustr=new Scanner(System.in);

        ArrayList<ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            ogrenci ogr=new ogrenci();

            System.out.println("okul no= ");ogr.okulno=okuint.nextInt();
            System.out.println("tam adı= ");ogr.tamadi=okustr.nextLine();
            System.out.println("notu=");ogr.notu=okuint.nextInt();

            snf.add(ogr);
        }

        bilgileriYazdir(snf);
        ortalamaYaz(snf);
    }

    public static void bilgileriYazdir(ArrayList<ogrenci> snf){
        for (ogrenci ogr:snf){
            System.out.println("ogr.okulno = " + ogr.okulno);
            System.out.println("ogr.tamadi = " + ogr.tamadi);
            System.out.println("ogr.notu = " + ogr.notu);
        }
    }

    public static void ortalamaYaz(ArrayList<ogrenci>snf){
        int toplam=0;
        for (ogrenci ogr:snf){
            toplam=toplam+ ogr.notu;
        }
        System.out.println("ort="+(toplam/ snf.size()));
    }

}
