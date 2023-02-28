package gun34._03_Polymorphism;

public class kopek extends hayvan{
    public kopek(String name) {
        super(name);
    }
    public void ses(){
        System.out.println("havladı");
    }
    public void kokladi(){
        System.out.println("kokladı");
    }
}
