package gun38._05_OOP_Soru;

public class borsh implements food{
    @Override
    public void taste() {
        System.out.println("Sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 55;
    }
    void boil(){
        System.out.println("Kısık ateşte kaynatılıyor");
    }
    void eatTomorrow(){
        System.out.println("Bir gün sonra servis edilir");
    }
}
