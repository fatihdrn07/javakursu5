package gun23;

import java.util.HashSet;

public class _06_odev {
    public static void main(String[] args) {
//        1- Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_hashset ; 4,2,3,1,7
//        cevap: 5
        HashSet<Integer>hs=new HashSet<>();
        System.out.println(totalCount(hs));

    }
    public static Integer totalCount(HashSet f ){
        HashSet<Integer>hs=new HashSet<>();
        hs.add(6);
        hs.add(3);
        hs.add(12);
        hs.add(1);
        hs.add(7);

        return hs.size();
    }
}
