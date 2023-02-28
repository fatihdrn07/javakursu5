package gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farklı kriter(regex) verilebiliyor.
        // regex : regular expression / düzenli ifadeler

        String text="Merhaba Dunya123";

        System.out.println("text.replaceAll(\"[abn]\",\"_\") = " + text.replaceAll("[abn]", "_"));
        // a  b ve n leri _ ile değiştir
        System.out.println("text.replaceAll(\"[A-Z]\",\"_\") = " + text.replaceAll("[A-Z]", "_"));
        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]", ""));
        System.out.println("text.replaceAll(\"[^0-9]\",\"\") = " + text.replaceAll("[^0-9]", ""));
        // rakamları dışındakileri sil



    }
}
