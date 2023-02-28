package gun33._03_Inheritance;

public class calisan {
    private String isim;
    private double maas;
    private int maasKatsayisi;

    public calisan(String isim, double maas, int maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }

    public double maashesapla(){
        return maas*maasKatsayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(int maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    @Override
    public String toString() {
        return "calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                "ödenecek maas="+maashesapla()+
                '}';
    }
}
