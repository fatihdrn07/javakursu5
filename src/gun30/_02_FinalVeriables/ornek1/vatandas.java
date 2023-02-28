package gun30._02_FinalVeriables.ornek1;

public class vatandas {
    String isim;
    final int tcNo;
    //yani sadece 1 kez veri atama şansı var.
    static int tcnoSayac=1;

    public vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcnoSayac++;
        //final değişkenlere sadece 1 kez veri atanabilir
        //o da ya tanımlanırken yada Constructor da
    }

    @Override
    public String toString() {
        return "vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
