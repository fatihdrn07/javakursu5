package gun37._01_Abstrack;

public class ford extends BinekOto implements IBinekOto {

    public ford(String marka, int uretimYili, int vitesAdeti) {
        super(marka, uretimYili, vitesAdeti);
    }

    @Override
    public int hizlanmaSuresi() {
        return 0;
    }
}
