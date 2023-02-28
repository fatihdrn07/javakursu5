package gun38._05_OOP_Soru;

public class lahmacun implements food{
    @Override
    public void taste() {
        System.out.println("Mükemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 32;
    }
    void dough(){
        System.out.println("Mayalı hamur hazırlandı");
    }
    void addMeat(){
        System.out.println("Özel kıyma eklendi");
    }
    void bake(){
        System.out.println("Odun ateşinde pişirildi");
    }
}
