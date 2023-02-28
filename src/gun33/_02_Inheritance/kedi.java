package gun33._02_Inheritance;

public class kedi extends hayvan{
    public kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("miyavvvv");
    }
}
