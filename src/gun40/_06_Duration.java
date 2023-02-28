package gun40;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration : hem LocalTime hem de LocalDateTime arasında ki farkı verir

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(19, 0, 0);
        LocalTime dersBitis = LocalTime.of(22, 0, 0);

        Duration GunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);

        System.out.println("GunlukDersSuresi.toHours() = " + GunlukDersSuresi.toHours());  // farkın toplam saat hali
        System.out.println("GunlukDersSuresi.toMinutes() = " + GunlukDersSuresi.toMinutes()); // farkın toplam dakika hali
        System.out.println("GunlukDersSuresi.toNanos() = " + GunlukDersSuresi.toNanos());

        // LocalDateTime  ** 2 tarih-saat arasında ki fark **
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();  // bugün

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());


    }
}
