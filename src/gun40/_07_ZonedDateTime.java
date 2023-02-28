package gun40;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {
        // başka zaman bölgelerinin (Time Zone) zaman bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        // şuan da benim bulunduğum default zamanı verdi

        System.out.println("zdt = " + zdt);
        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();

        for(String z: zamanBolgeleri)
        {
            if (z.toLowerCase().contains("ist"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime saatLondon=ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);



    }
}
