package gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        //ArrayList Collection grubunun bir elemanı
        //Array i sıralarken Arrays.sort u kullandığımız gibi
        //ArrayList i Collection metodlarını kullanacağız

        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //max min eleman bulma
        System.out.println("Collections.max(sayilar) = " + Collections.max(sayilar));
        System.out.println("Collections.min(sayilar) = " + Collections.min(sayilar));

        //bütün elemanları set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        //replaceall
        Collections.replaceAll(sayilar,0,5); // 0 lara 5 atadı
        System.out.println("sayilar = " + sayilar);

        //tanımlarken değer atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        System.out.println("liste = " + liste);
        ArrayList<String>strliste=new ArrayList<>(Arrays.asList("ahmet","mehmet","ali"));
        System.out.println("strliste = " + strliste);

        ArrayList<Integer>liste2=new ArrayList<>();
        Collections.addAll(liste2,2,3,4,5,7,9);

        //diziyi direkt ArrayList e nasıl atarım
        Integer[] dizi2={2,3,5,8};
        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);
    }
}
