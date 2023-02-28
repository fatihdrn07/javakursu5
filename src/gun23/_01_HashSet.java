package gun23;

import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        // hem arraylist gibi olsun hemde tekrar değerleri içine almasın
        // öyle bir set ver yani dizi tipi ver

        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada
        //elemanları tutar

        // LinkedHashSet -> sen ekledikce EKLEME SIRASINA göre elemanları saklar

        // TreeSet -> sen ekledikce onları her zaman SIRALI tutar
        //bunların ortak özelliği hiç TEKRAR değer dulundurmaz

        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);
        hs1.add(2);

        System.out.println("hs1 = " + hs1);  //tekrar ifadeler yok



    }
}
