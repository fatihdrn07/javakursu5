package gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {

        // startswith : bununla başlıyor mu ?
        // sonuç true veya false

        String text="HCL Teknoloji";


        System.out.println("text HC = " + text.startsWith("HC")); // true
        System.out.println("text hc = " + text.startsWith("hc")); // false
        System.out.println("text sa = " + text.startsWith("sa")); // false




    }
}
