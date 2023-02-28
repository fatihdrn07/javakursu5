package gun31._03_Enum;

public enum aylar {
    OCAK(1,31,"ocak"),
    SUBAT(2,28,"şubat"),
    MART(3,30,"mart"),
    NISAN(4,31,"nisan"),
    MAYIS(5,30,"mayıs"),
    HAZIRAN(6,31,"haziran"),
    TEMMUZ(7,30,"temmuz"),
    AGUSTOS(8,31,"ağustos"),
    EYLUL(9,30,"eylül"),
    EKIM(10,31,"ekim"),
    KASIM(11,30,"kasım"),
    ARALIK(12,31,"aralık");

    int ayNo;
    int gunMiktar;
    String ayAd;

    aylar(int ayNo, int gunMiktar, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.ayAd = ayAd;
    }
}
