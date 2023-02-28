package gun42;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program çalışmaya başladı");

        try {  // dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        }     // hata oluğu zaman programı kırma
        catch (Exception ex)
        // ex isimli değişkende oluşan hataların bilgisi atanıyor
        { // hata olduğunda yapılması istenenler buraya yazılıyor
            System.out.println("hata oluştu lütfen tekrar deneyiniz.");
            System.out.println("tüm hata mesajı= "+ex);
            System.out.println("hatanın açıklaması= "+ex.getMessage());
            // hata mesajını kendine mail atabilirsin
            // log tutma : program nasıl çalışıyor. hata log larını DB yazabilirsin
        }
        System.out.println("program bitti");

        try {
            // Java ve Toll lara çalışmaya devam et
            // konuları öğrenmeye ve çalışmaya devam
            // anlamadığın yer mi oldu ?
        }
        catch (Exception ex)
        {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin, DEVAM
        }

        // sonunda seni güzel bir meslek bekliyor.
    }
}
