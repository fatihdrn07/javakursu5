package gun34._01_Protected.paket1;

public class p1Hayvan {
    public String ad; //her paketten her yerden
    int yas; //sadece kendi paketinden
    protected String cinsi; //default gibi çalışır, extends durumda farklı paketten erişilebilir
    private String renk; //sadece kendi class ından erişilir

}
