package gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"Fatih Duran");      // numarasını biz veriyoruz
        hm.put(1002,"Ismet Temur");
        hm.put(2001,"Rıdvan Celen");
        hm.put(5001,"Burak Bülbül");
        hm.put(1001,"Elif Unver");  // güncelledi

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for(Integer k:hm.keySet()){
            System.out.print(k+"\t");
        }
        for (String v:hm.values()){
            System.out.print(v+"\t");
        }
        for (Map.Entry<Integer,String> kv:hm.entrySet()){
            System.out.println(kv.getKey()+" - "+kv.getValue());
        }
    }
}
