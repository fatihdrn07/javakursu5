package gun36._01_ornek;

public class toyotoPirus extends vehicle implements IGaz,IElektrik{
    public toyotoPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 15 yıl gider";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "İlk 3 km elektrikle gider";
    }
}
