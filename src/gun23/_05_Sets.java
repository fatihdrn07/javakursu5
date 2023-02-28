package gun23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (10 a kadar) doldurduktan sonra
        // tekrarlı değerleri almayacak şekilde yeni bir diziye atınız

        Integer[] dizi=new Integer[10];
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*11);
            hs.add(dizi[i]);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("hs = " + hs);

        // 2. Yöntem
        // HashSet<Integer>hs2=new HashSet<>(Arrays.asList(dizi));

    }
}
