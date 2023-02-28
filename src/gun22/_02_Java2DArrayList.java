package gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5;  //tek bir rakam tutabilen bir değişken
        int[]dizi=new int[20]; //20 adet sayi saklayabilen değişken
        int[][]tablo=new int[20][2]; //20x2 lik sayi saklayabilen değişken

        ArrayList<Integer>liste=new ArrayList<>(); //istenildiği kadar sayi eklenebilen, uzunluğu değişken
        /*************************/

        //bir sınıfta 20 kişi var ve bunların 3 dersi olsun. öğrencilerin bu 3 derse
        //ait nasıl bir değişkende saklayabilirim

        ArrayList<Integer>matnotlari=new ArrayList<>();
        ArrayList<Integer>fiznotlari=new ArrayList<>();
        ArrayList<Integer>kimnotlari=new ArrayList<>();

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiznotlari.add(30);
        fiznotlari.add(45);

        kimnotlari.add(60);
        kimnotlari.add(70);
        kimnotlari.add(80);
        kimnotlari.add(90);

        //ArrayList in ArrayList i nasıl yaparım
        ArrayList<ArrayList<Integer>>notlarlistesi=new ArrayList<>();
        notlarlistesi.add(matnotlari);
        notlarlistesi.add(fiznotlari);
        notlarlistesi.add(kimnotlari);

        notlarlistesi.get(0); // -> matnotlari
        int matBirNot=notlarlistesi.get(0).get(0); //mat notlarının ilkini aldım

        System.out.println("notlarlistesi = " + notlarlistesi.get(0)); //mat notları
        System.out.println("notlarlistesi = " + notlarlistesi.get(1)); //fiz notları
        System.out.println("notlarlistesi = " + notlarlistesi.get(2)); //kim notları

        // yukarıdakinin yerine bir for döngüsü nasıl kullanırız

        for (int i = 0; i < notlarlistesi.size(); i++) {
            System.out.println("notlarlistesi "+i+" = " + notlarlistesi.get(i));
        }

        /********* satır sütun yazdırma *********/

        for (int i = 0; i < notlarlistesi.size(); i++) {
            for (int j = 0; j < notlarlistesi.get(i).size(); j++) {
                System.out.print(notlarlistesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }




    }
}
