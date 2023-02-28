package gun37._03_Abstrackt;

public abstract class food {
    private  String name;
    abstract public void madeIn();
    abstract public void taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
