package gun33._02_Inheritance;

public class hayvanatBahcesi {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.
    public static void main(String[] args) {

        kopek kopek1=new kopek("beyaz",35,"pit bull");
        kopek1.konustu();

        kedi kedi1=new kedi("siyah",8,"tekir");
        kedi1.konustu();

        ordek ordek1=new ordek("siyah",6,"gövel",90);
        ordek1.konustu();

        yilan yilan1=new yilan("kırmızı",13,"anakonda",8);
        yilan1.konustu();

    }
}
