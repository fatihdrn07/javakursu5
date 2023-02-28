package gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // 01234 : harflerin oda numaraları: index.

        String cumle = "merhaba dunya";
        // D nin indexi kaçtır
        // M nin indexi kaçtır
        // 0(536)2989339 -> ( in numarası kaçtır


        System.out.println("cumle = " + cumle.indexOf("m")); //0
        System.out.println("cumle = " + cumle.indexOf("a")); //4
        System.out.println("cumle.indexOf(\"ha\") = " + cumle.indexOf("ha")); //3
        System.out.println("cumle.indexOf(\"a\",5) = " + cumle.indexOf("a", 5)); //6
        // a yı aramaya 5(dahil) nolu index ten sonra başla


    }
}
