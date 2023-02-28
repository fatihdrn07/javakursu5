package gun35._06_Interface;

public class Diktortgen implements ISekil{
    @Override
    public double cevresi(int kisakenar, int uzunkenar) {
        return (kisakenar+uzunkenar)*2;
    }

    @Override
    public double alani(int kisakenar, int uzunkenar) {
        return (kisakenar*uzunkenar);
    }
}
