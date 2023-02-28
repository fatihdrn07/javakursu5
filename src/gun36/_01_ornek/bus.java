package gun36._01_ornek;

public class bus extends vehicle implements IDizel{
    public bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDizel() {
        return "Bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "Şehir içine girme, yavaş sür";
    }
}
