package gun37._02_Abstrack;

public abstract class sekil {
    private String name;
    abstract double alan();  // soyut
    abstract double cevre(); // soyut

    public void ciz()        // somut
    {
        System.out.println(name+" isimli sekil çizildi.");
    }

    @Override
    public String toString() {
        return "sekil : " +
                "\nname='" + name + '\'' +
                "\nalan="+alan()+ '\'' +
                "\ncevre="+cevre()+ '\'' +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
