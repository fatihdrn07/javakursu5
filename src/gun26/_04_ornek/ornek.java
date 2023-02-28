package gun26._04_ornek;

public class ornek {
    /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */
    public static void main(String[] args) {

        musteri mus1=new musteri();
        mus1.name="Fatih Duran";
        mus1.elektrikhesabi=new elektrikHesabi();
        mus1.elektrikhesabi.tuketimekle(50);
        mus1.elektrikhesabi.tuketimekle(60);
        mus1.elektrikhesabi.tuketimekle(70);
        mus1.elektrikhesabi.toplamtuketimyaz();

        mus1.elektrikhesabi.faturaYaz(mus1.name);

    }
}
