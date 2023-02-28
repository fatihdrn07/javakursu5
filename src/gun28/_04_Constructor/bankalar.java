package gun28._04_Constructor;

public class bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {
        banka bank1=new banka();
        bank1.adi="finans bank";
        bank1.kurulusYili=1987;
        bank1.subeSayisi=154;

        banka bank2=new banka("iş bankası",1953,265);

        banka bank3=new banka("ziraat bankası",1936);

        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);


    }
}




