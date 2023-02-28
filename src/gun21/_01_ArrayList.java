package gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        //dizi, array : boyut belli sonradan değiştirilemez
     int []dizi=new int[5]; //Array 5 elemanlı boyutu sonradan değiştirilemiyor

        //boyutu dinamik olsun, eleman ekledikce uzasın, sildikce kısalsın
        //ArrayList : boyutu başta vermene bile gerek yok, boyutu başlangıçta 0
        //eleman ekledikce artar, sildikce azalır

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Fatih"); //uzunluk 1
        isimler.add("Ayşe"); //uzunluk 2
        isimler.add("İbrahim"); //uzunluk 3
        isimler.add("Elif"); //uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Muhammed"); //verilen indexe ekliyor diğerleri 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zeynep"); //verilen indexteki elemanı değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Fatih"); //var mı
        System.out.println("varMi = " + varMi);

        isimler.remove("Elif"); //verilen ismi siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); //rakam verildiğinde index kaul eder ve ona göre siler
        System.out.println("isimler = " + isimler);

        int indexofFatih= isimler.indexOf("Fatih");
        System.out.println("indexofFatih = " + indexofFatih);

        String ilkEleman=isimler.get(0); // verilen indexdeki değeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); //her şeyi temizler
        System.out.println("isimler = " + isimler);
    }
}
