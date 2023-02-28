package gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> Hashset, LinkedHashSet, TreeSet
        // Map -> Hashmap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        // anahtarın tipi Integer, değerinin tipi String olsun
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1001,"Fatih Duran");      // numarasını biz veriyoruz
        hm.put(1002,"Ismet Temur");
        hm.put(2001,"Rıdvan Celen");
        hm.put(5001,"Burak Bülbül");
        hm.put(1001,"Elif Unver");  // güncelledi

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.containsKey(1002) = " + hm.containsKey(1002));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet()); // anahtarlar
        System.out.println("hm.values() = " + hm.values()); //değerler

        hm.remove(5001);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
