package gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // bir kartvizit uygulamasını 2 kişi için yapınız

        HashMap<String, String> uKartVizit = new HashMap<>();
        uKartVizit.put("isim", "uğur yılmaz");
        uKartVizit.put("e-mail", "ugur@gmail.com");
        uKartVizit.put("adres", "çekmeköy/istanbul");
        uKartVizit.put("telefon", "05345783168");

        System.out.println("uKartVizit.get(\"isim\") = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(\"telefon\") = " + uKartVizit.get("telefon"));

        HashMap<String, String> aKartVizit = new HashMap<>();
        aKartVizit.put("isim", "ayşe bayrak");
        aKartVizit.put("e-mail", "ayse@gmail.com");
        aKartVizit.put("adres", "şişli/istanbul");
        aKartVizit.put("telefon", "05345363164");

        HashMap<String, HashMap<String, String>>kartvizitler=new HashMap<>();

        kartvizitler.put("ugur",uKartVizit);
        kartvizitler.put("ayse",aKartVizit);

        System.out.println("kartvizitler.get(\"ugur\") = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(\"ayse\") = " + kartvizitler.get("ayse"));

        System.out.println("aysenin adresi = " + kartvizitler.get("ayse").get("adres"));

        // sadece e-mailler
        for (Map.Entry< String,HashMap<String, String>>kv:kartvizitler.entrySet()){
            System.out.println("e-mailler = " + kv.getValue().get("e-mail"));
        }
    }
}
