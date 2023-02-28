package gun29._02_ClassErisimleri;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="İsmet";
        cal1.surname="Temur";
        //cal1.password="1234";
        // private kendi paketinden bile cağırılamaz

        cal1.sifreAta("1234");
        cal1.sifreAta("M126_asds56");
        cal1.sifreGoster();
    }
}
