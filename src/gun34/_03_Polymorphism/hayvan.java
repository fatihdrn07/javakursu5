package gun34._03_Polymorphism;

public class hayvan {
    private String name;

    public hayvan(String name) {
        setName(name);
    }

    public void ses(){
        System.out.println("ses çıkarttı..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
