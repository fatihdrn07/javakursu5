package gun32._03_Encapsulation;

import java.util.Scanner;

public class okulMain {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        okul yeniokul=new okul("kabataş okulu",3);

        do {

            System.out.println("Öğrenci Adı=");String ad=okuStr.nextLine();
            System.out.println("Öğrenci Soyadı=");String soyad=okuStr.nextLine();
            System.out.println("Öğrenci Yaşı=");int yas=okuInt.nextInt();

            if (yas<15)
            {
                ogrenci ogr=new ogrenci(ad,soyad,yas);
                yeniokul.getOgrenciler().add(ogr);
            }
            else
            {
                System.out.println("Öğrenci yaşı okul için uygun değil.");
            }


        }while (yeniokul.getOgrenciler().size()<= yeniokul.getKontenjan());

    }
}
