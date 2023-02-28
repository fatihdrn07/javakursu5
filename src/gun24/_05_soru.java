package gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String,String>sozluk=new TreeMap<>();
        Scanner oku=new Scanner(System.in);
        Scanner okustr=new Scanner(System.in);
        int secim=0;

        do {
            System.out.print("MENU\n1-EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4-ARAMA\n5-SİLME\n6-CIKIS");
            secim=oku.nextInt();

            switch (secim)
            {
                case 1:
                    System.out.println("kelime giriniz:");
                    String kelime=okustr.nextLine();
                    System.out.println("manasını yazınız:");
                    String manasi=okustr.nextLine();
                case 2:
                    System.out.println("düzeltme secildi");
            }
        }while (secim!=6);

        // TODO : geri kalan menü işlemleri yapılacak
        //TODO : menülerde yapılacak işlemleri METOD ile yapınız
    }
}
