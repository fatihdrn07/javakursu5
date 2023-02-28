package gun32._01_Encapsulation;

public class kisiMain {
    public static void main(String[] args) {
        kisi kisi1=new kisi("fatih","duran",26);

        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());

        System.out.println("kisi1 = " + kisi1);

        //değişkene direk erişimi kapatıp
        //bir method ile korumalı veri gönderme ve alma
        //işlemine Encapsulation denir.
    }
}
