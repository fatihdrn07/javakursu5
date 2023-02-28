package gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        //replaceFirst : bir string içindeki karakterleri verilenle değiştirir. sedece ilkini

        String text = "Merhaba Dunya";

        System.out.println("text.replaceFirst(\"a\",\"e\") = " + text.replaceFirst("a", "e"));
        System.out.println("text.replaceFirst(\"ba\",\"de\") = " + text.replaceFirst("ba", "de"));
        System.out.println("text.replaceFirst(\"Dunya\",\"Java\") = " + text.replaceFirst("Dunya", "Java"));
        System.out.println("text.replaceFirst(\"a\",\"\") = " + text.replaceFirst("a", ""));


    }
}
