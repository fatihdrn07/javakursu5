package gun35._02_Interface;

public class A6 implements IYazdirilabilir{
    // Methodlar zorunlu olarak alındı
    @Override
    public void yazdir() {
        System.out.println("yazdirma islemi basladi");
    }
}
