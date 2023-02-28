package gun34._02_Final.methodFinal;

public class araba extends vasita {
    private String renk;

    public araba(String cinsi, String renk) {
        super(cinsi);
        this.renk = renk;
    }

//    @Override
//    public void vasitaOzelYazdir() {
//        System.out.println("renk = " + renk);
//        super.vasitaOzelYazdir();
//    }
    // final methodlar override edilemez
    // sadece direkt kullanılır

    @Override
    public String toString() {
        return "araba{" +
                "cinsi="+getCinsi()+
                "renk='" + renk  +
                '}';
    }
}
