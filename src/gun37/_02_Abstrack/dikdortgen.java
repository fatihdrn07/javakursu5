package gun37._02_Abstrack;

public class dikdortgen extends sekil{
    private double kisaKenar;
    private double uzunKenar;

    public dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    double alan() {
        return this.kisaKenar*this.uzunKenar;
    }

    @Override
    double cevre() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
