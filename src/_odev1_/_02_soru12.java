package _odev1_;

public class _02_soru12 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.

        String[] meyve={"Apple","Orange","Banana","Pineapple"};
        for (int i = 0; i < meyve.length; i++) {
            if (meyve[i]=="Apple")
                System.out.println("true");break;
        }
    }
}
