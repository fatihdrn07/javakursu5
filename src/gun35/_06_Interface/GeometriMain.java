package gun35._06_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Diktortgen d=new Diktortgen();
        System.out.println( d.alani(4,5));
        System.out.println(d.cevresi(4,5));

        Kare k=new Kare();
        System.out.println(k.alani(5,5));
        System.out.println(k.cevresi(5,5));
    }
}
