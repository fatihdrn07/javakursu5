package gun29._03_Protected.bir;

public class Doctor  {
    protected String adi; //default ile aynı
    String bolumu; // default
    private String sicilNo; //private
    public String hasteneAd; //public

      Doctor(){  // default constructor

    }

    public Doctor(String adi){
        this.adi=adi;
    }
}