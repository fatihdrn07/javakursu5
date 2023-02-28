package _odev1_;

public class _01_soru5 {
    public static void main(String[] args) {
        //5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int sayac=0;
        int sayac2=0;
        while (sayac<=100){
            sayac++;
            if (sayac%10==5)
                sayac2++;
        }
        System.out.println(sayac2);
    }
}
