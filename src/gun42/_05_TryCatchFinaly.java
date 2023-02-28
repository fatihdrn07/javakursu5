package gun42;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {

        long startTime = 0;
        String srt = "";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatasan önceki kısım");
            char ilkHarf = srt.charAt(0);
            System.out.println("Hatadan sonraki kısım");
            // hata olma olasığının olduğu kodlar
        } catch (Exception ex) {
            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        } finally  // hata olsada çalışır, olmasada çalışacak kısım, bu bölüm yukarıdaki
        // süreçle olduğunu göstermek için finally yazılır
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapılacaklar");
        }

        System.out.println("diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
