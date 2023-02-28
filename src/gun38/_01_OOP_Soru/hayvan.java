package gun38._01_OOP_Soru;

public abstract class hayvan {
    private int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    private static int idsayac=1;

    public hayvan( String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=idsayac++;
    }

    @Override
    public String toString() {
        System.out.print("yiyeceği= "); yiyecegi();
        System.out.print("yemek mik= "); yemekMiktari();
        System.out.print("uyku süresi= "); gunlukUykuSuresi();
        System.out.print("sesi= "); sesi();
        return "hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                "}\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
