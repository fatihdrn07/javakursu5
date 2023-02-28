package gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {

        Doctor dok1=new Doctor();
        dok1.adi="İsmet";
        dok1.bolumu="Dahiliye";
        dok1.hasteneAd="Ankara Hastanesi";
        //doc1.sicilNo   private

        Doctor dok2=new Doctor("Fatih");
    }
}
