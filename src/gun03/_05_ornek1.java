package gun03;

public class _05_ornek1 {
    public static void main(String[] args) {
        /*iki kenarı tanımlı olarak verilen bir dikdörtgenin
        çevresini ve alanını bulunuz*/
        int kisakenar=7;
        int uzunkenar=12;
        int cevre, alan;
        cevre=kisakenar+kisakenar+uzunkenar+uzunkenar;
        alan=kisakenar*uzunkenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);



    }
}
