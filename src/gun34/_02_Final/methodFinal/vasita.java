package gun34._02_Final.methodFinal;

public class vasita {
    private String cinsi;

    public vasita(String cinsi) {
        setCinsi(cinsi);
    }
    public final void vasitaOzelYazdir(){
        System.out.println("Özel yazdırma methodu");
    }

    @Override
    public String toString() {
        return "vasita{" +
                "cinsi='" + cinsi + '\'' +
                '}';
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }
}
