package gun27._03_ornek;

import java.util.ArrayList;

public class student {
    String name;
    int maxsaat;
    ArrayList<lesson> dersleri=new ArrayList<>();

    public void dersekle(lesson ders)
    {
        int suanToplamSaat=0;
        for (lesson d:dersleri)
            suanToplamSaat+=d.saat;

        if (suanToplamSaat+ders.saat<=maxsaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name+": Kredi miktarı aşıldı");
    }

   public void dersleriYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin"+name);
        System.out.println("Aldığınız dersler aşağıdadır");
        for (lesson d:dersleri)
            System.out.println(d.name+" "+d.saat);
    }

}
