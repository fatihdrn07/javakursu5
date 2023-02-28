package gun33._02_Inheritance;

public class kopek extends hayvan {


    public kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("hav havv");
    }
}
