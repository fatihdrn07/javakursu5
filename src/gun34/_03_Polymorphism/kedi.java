package gun34._03_Polymorphism;

public class kedi extends hayvan{
    public kedi(String name) {
        super(name);
    }
    public void ses(){
        System.out.println("miyavladı");
    }
    public void tirmaladi(){
        System.out.println("tırmaladı");
    }
}
