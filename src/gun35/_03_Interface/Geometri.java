package gun35._03_Interface;

public class Geometri {
    public static void main(String[] args) {
        // Bir interface in birden fazla class tarafından implemente edilmesi
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        // interface lerde nesne üretilemez fakat referans tipi
        // oluşturulabilir. bu bize polymorphism sağladı
        ICizdirir c2=new Cember();
        c2.ciz();
    }
}
