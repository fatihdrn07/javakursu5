package gun30._01_StaticVariables.ornek1;

public class okul {
    public static void main(String[] args) {

        ogrenci ogr1=new ogrenci("ismet","temur");
        System.out.println("ogr1 = " + ogr1);


        ogrenci.okulAd="Basogretmen Ilkokulu";
        System.out.println("ogr1 = " + ogr1);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi


    }
}
