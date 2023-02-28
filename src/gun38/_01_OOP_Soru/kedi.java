package gun38._01_OOP_Soru;

public class kedi extends hayvan{
    public kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama, balık");
    }

    @Override
    void yemekMiktari() {
        System.out.println("500 gram");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
