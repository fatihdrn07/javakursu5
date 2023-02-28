package gun04;

public class _08_ornek3 {
    public static void main(String[] args) {
        //string olarak verilen 2 adet bağış parasının toplamını yazdırınız

        String bagis1="1465";
        String bagis2="2348";

        int bagis1Deger=Integer.parseInt(bagis1);
        int bagis2Deger=Integer.parseInt(bagis2);
        int toplamBagis=bagis1Deger+bagis2Deger;

        System.out.println("toplamBagis = " + toplamBagis);
    }
}
