package gun35._04_Interface;

public class A4 implements IGosterir,IYazdirir{
    // Hem karasal hem uydu anten
    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirdi");
    }
}
