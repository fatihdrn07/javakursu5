package gun39;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ay yıl bilgisini tutar.

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // kendisinde ki hazır formatlara bakalım

        System.out.println("ISO_DATE=" + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT   =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM  =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG    =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL    =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n******************");
        // Localde aldığım tarihi istediğim ülkenin formatına göre, diline göre nasıl gösteririm ?
        // örneğin localde ki saati Almanya ya nasıl gösteririz

        System.out.println("FULL Almanya gösterimi  =\n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        // Lokalizasyon tanımlaması
        // en-US : birincisi dili, ikincisi ülkeyi temsil ediyor. Amerikan İngilizcesi
        // en-Uk : İngiliz İngilizcesi
        // fr-Ca : Kanada Fransızcası
        // en-CA : Kanada İngilizcesi
        // tr-TR : Türkiye Türkcesi

        Locale[] kullanilabilirLocaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLocaller) {

            System.out.print("Dil = " + l.getDisplayLanguage());
            System.out.print(", Ulke = " + l.getDisplayCountry());
            System.out.print(", " + l.getLanguage());
            System.out.println(", " + l.getCountry());
        }

        Locale LocalCince = new Locale("zh", "CN");
        System.out.println("FULL Çince gösterimi =\n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(LocalCince)));


        System.out.println("\n************* İSTEDİĞİM FORMATTA GÖSTERİM *************");
        // istediğim formatta gösterim
        System.out.println("tarih=" + tarih);

        DateTimeFormatter ozelFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy" + tarih.format(ozelFormat));

        DateTimeFormatter o2 = DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy" + tarih.format(o2));

        DateTimeFormatter o3 = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy " + tarih.format(o3));

        System.out.println("ozel format ve Loc EEEE dd.MM.yyyy = " + tarih.format(o3.withLocale(Locale.UK)));

        DateTimeFormatter o4 = DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy" + tarih.format(o4));

        DateTimeFormatter o5 = DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy" + tarih.format(o5));

        System.out.println("\n***************");
        // kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz

        LocalDate tarih1 = LocalDate.of(2000, 5, 17);
        LocalDate tarih2 = LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat) = " + tarih2.format(ozelFormat));
    }
}
