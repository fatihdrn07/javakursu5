package gun34._03_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        kopek kopek1=new kopek("karabaş");
//        kopek1.ses();;
//        kopek1.kokladi();

        kedi kedi1=new kedi("kaymak");
//        kedi1.ses();
//        kedi1.tirmaladi();

        kopeksesi(kopek1);
        kedisesi(kedi1);

        hayvansesi(kopek1);
        hayvansesi(kedi1);

        /* ********************** */

        hayvan hayvan1=new hayvan("ördek"); //hayvanlardan bir hayvan
        hayvan hayvan2=new kopek("kangal"); //hayvanlardan kopek
        hayvan hayvan3=new kedi("tekir"); //hayvanlardan kedi
        //referans      nesne türü
        System.out.println("---------------");
        hayvan1.ses(); //genel hayvan ses çıkarttı
        hayvan2.ses(); //kopek hayvan havladı
        hayvan3.ses(); //kedi hayvan miyavladı
        System.out.println("---------------");

        hayvan2.ses(); //kopek de olsa hayvan referansı sebebiyle methodlar kısıtlı
        // peki bu hayvanı kopek formu nasıl ortaya çıkrtırım
        // tip dönüşmü acaba işime yarar mı
        ((kopek)hayvan2).kokladi(); // artık diğer methodları kullanabilirim
        // ((int)Math.random()) costing burada ki gibi tip dönüşümü






        // Polymorphism - çok formluluk - çok çeşitlilik

        // Polymorphism :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        // ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

    }
    public static void kopeksesi(kopek kopek1){
        kopek1.ses();
    }
    public static void kedisesi(kedi kedi1){
        kedi1.ses();
    }
    public static void hayvansesi(hayvan hayvan){
        hayvan.ses();
    }
}
