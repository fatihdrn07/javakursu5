package gun33._02_Inheritance;

public class yilan extends hayvan{
    private int uzunluk;
    public yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public void konustu() {
        System.out.println("tısssssss");
    }
}
