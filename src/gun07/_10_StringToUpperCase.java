package gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // touppercase : stringi büyük harfe çevirir

        String text = "Merhaba Dunya";

        System.out.println("orjinal hali= " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me veya ME ile başlıyor mu ="
                + text.toUpperCase().startsWith("ME")); // true


    }
}
