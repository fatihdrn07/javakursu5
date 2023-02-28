package gun23;

import java.util.HashSet;

public class _07_odev {
    public static void main(String[] args) {
//        2- changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//**ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String>meyveler=new HashSet<>();
        System.out.println(changeSet("1","2"));

    }
    public static HashSet changeSet(String a,String b){
        HashSet<String>meyveler=new HashSet<>();
        meyveler.add("banana");
        meyveler.add("strawberry");
        meyveler.add("kiwi");
        meyveler.add("pineapple");
        a="banana";
        b="peach";
        if (meyveler.contains(a)){
            meyveler.remove(a);
            meyveler.add(b);
        }
        return meyveler;
    }
}
