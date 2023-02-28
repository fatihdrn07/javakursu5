package gun37._02_Abstrack;

public class daire extends sekil{
    private double yaricap;

    public daire(double yaricap) {
        setYaricap(yaricap);
    }

    @Override
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return Math.PI*yaricap*2;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
