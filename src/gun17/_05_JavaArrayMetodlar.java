package gun17;

import java.util.Arrays;

public class _05_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"Fatih","Elif","Emin","Zeynep"};

        //diziyi string olarak direkt yazdırır
        System.out.println("isimler = " + Arrays.toString(isimler));



        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));


        //diziler eşit mi?
        int[] a={1,8,5,54};
        int[] b={1,8,5,54};
        int[] c={1,8,2,54};

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));





    }
}
