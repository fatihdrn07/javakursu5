package gun40;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasında ki farkı gösterir
        // sadece LocalDate ler için kullanılır

        LocalDate dogumTarihi = LocalDate.of(1996, 8, 7);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " Yaşındasınız");

        /*************************************/

        Period period3gun = Period.ofDays(3);
        Period period3ay = Period.ofMonths(3);

        System.out.println("period3gun = " + period3gun);
        System.out.println("period3ay = " + period3ay);

        LocalDate ucgunSonra = buGun.plus(period3gun);
        System.out.println("ucgunSonra = " + ucgunSonra);

        LocalDate ucaySonra = buGun.plus(period3ay);
        System.out.println("ucaySonra = " + ucaySonra);

        /***************************************/
        //kursun bitiş tarihini bunulunuz 6 ay - 31 Ekim 2022

        LocalDate kursBaslangic = LocalDate.of(2022, 10, 31);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        // kursun birimine ne kadar kaldı
        Period nekadarSureKaldi = Period.between(buGun, kursBitis);
        System.out.println("nekadarSureKaldi = " + nekadarSureKaldi);

        // kurs ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi = Period.between(kursBaslangic, buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);

    }
}
