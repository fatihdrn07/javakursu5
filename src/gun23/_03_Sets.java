package gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String>renkler=new HashSet<>();
        renkler.add("red");
        renkler.add("green");
        renkler.add("blue");
        renkler.add("red");
        renkler.add("RED");

        System.out.println("renkler = " + renkler);

        // Ekrana tek tek nasıl yazdırırım
        for (String eleman:renkler) {   // sıralama garanti değil
            System.out.println("eleman = " + eleman);
        }

        Iterator gosterge= renkler.iterator();

        while (gosterge.hasNext()){
            System.out.println("gosterge.next() = " + gosterge.next());
        }

    }
}
