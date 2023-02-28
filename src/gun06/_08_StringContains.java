package gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin içerisinde karakter(lerin) var olup
        // olmadığını boolean cinsinden söyler true false


        String cumle="merhaba dunya";

        boolean varmi=cumle.contains("a");
        System.out.println("varmi = " + varmi);


        //direkt de yapabiliriz

        System.out.println("a varmi = " + cumle.contains("a"));

        System.out.println("ya varmi = " + cumle.contains("ya"));
        System.out.println("k varmi = " + cumle.contains("k"));


    }
}
