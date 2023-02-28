package gun38._05_OOP_Soru;

public class palov implements food{
    @Override
    public void taste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 35;
    }
    void fry(){
        System.out.println("Pirinç ve şehriye kavruldu");
    }
    void boil(){
        System.out.println("Kısık ateşte pişirildi");
    }
}
