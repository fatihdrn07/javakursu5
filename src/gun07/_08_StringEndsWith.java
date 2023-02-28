package gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {

        // endswith : verilen karakterler ile bitiyor mu ?
        // sonuç true veya false

        String text="Merhaba Dünya";

        System.out.println("text.endsWith(\"ya\") = " + text.endsWith("ya")); //true
        System.out.println("text.endsWith(\"n\") = " + text.endsWith("n")); //false
        System.out.println("text.endsWith(\"a\") = " + text.endsWith("a")); //true
        System.out.println("text.endsWith(\"A\") = " + text.endsWith("A")); //false
        System.out.println("text.endsWith(\"Dünya\") = " + text.endsWith("Dünya")); //true



    }
}
