package gun31._03_Enum;

public class aylarMain {
    public static void main(String[] args) {

        System.out.println("aylar.AGUSTOS = " + aylar.AGUSTOS);
        // ayın kaç gün sürdüğünü metod gerekiyor
        // ayın türkçe yazılışı metod gerekiyor
        // ayın gerçek sıra nosu metod gerekiyor

        // Java diyorki bu şekilde tek bir kelime veya
        // sayı olan degerleri olacaksa, sana bir kolaylık

        aylar ay=aylar.AGUSTOS;
        System.out.println("ay = " + ay);
        System.out.println("ay.ayAd = " + ay.ayAd);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        for (aylar a:aylar.values()){
            System.out.println(a.ayAd+" - "+a.gunMiktar+" - "+a.ayNo);
        }
    }
}
