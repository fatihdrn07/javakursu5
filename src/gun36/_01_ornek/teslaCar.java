package gun36._01_ornek;

public class teslaCar extends vehicle implements IElektrik{
    public teslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yıl gider";
    }

    @Override
    public String drive() {
        return "Auto sürüş özelliği var";
    }
}
