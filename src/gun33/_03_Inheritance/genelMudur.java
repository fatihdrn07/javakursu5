package gun33._03_Inheritance;

public class genelMudur extends calisan {

    private int tazminat;

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    public genelMudur(String isim, double maas, int maasKatsayisi, int tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maashesapla() {
        return super.maashesapla()+getTazminat();
    }

    @Override
    public String toString() {
        return "genelMudur{" +
                "isim="+getIsim()+
                "maas="+getMaas()+
                "maaskatsayısı="+getMaasKatsayisi()+
                "tazminat=" + getTazminat() +
                "ödenecek maas="+ maashesapla()+
                '}';
    }
}
