package gun38._05_OOP_Soru;

public class adanaKebap implements food{
    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 80;
    }

    void marinade() {
        System.out.println("Et özel baharatlarla terbiye edildi");

    }
    void grill(){
        System.out.println("Kömür ateşinde pişirildi");

    }
}
