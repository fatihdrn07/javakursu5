package gun04;

public class _04_WideningCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 5;

        sayi = (int) oran;
        //tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
        //değerlere bak, eğer olusan veri kaybını anladıysan ve kabulünse
        //bana bunu bilerek yaptığını göster.

        System.out.println("sayi = " + sayi);

        /* ------------------------------------------------------ */


    }
}
