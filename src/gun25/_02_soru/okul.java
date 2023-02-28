package gun25._02_soru;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        Scanner okuint=new Scanner(System.in);
        Scanner okustr=new Scanner(System.in);
        ArrayList<ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            ogrenci ogr=new ogrenci();
            System.out.print("Öğrenci adi= "); ogr.adi=okustr.nextLine();
            System.out.print("Öğrenci soyadi= "); ogr.soyadi=okustr.nextLine();
            System.out.print("Öğrenci sınıfı= "); ogr.sinifi=okuint.nextInt();
            System.out.print("Öğrenci adresi= "); ogr.adres=okustr.nextLine();

            snf.add(ogr);
        }

        for (ogrenci ogr:snf){
            System.out.print("Öğrenci adi= "+ogr.adi);
            System.out.print("Öğrenci soyadi= "+ogr.soyadi);
            System.out.print("Öğrenci sınıfı= "+ogr.sinifi);
            System.out.print("Öğrenci adresi= "+ogr.adres);
        }

    }
}

class ogrenci{
    // properties, field, özellik
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}
