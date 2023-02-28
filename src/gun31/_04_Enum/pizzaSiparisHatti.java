package gun31._04_Enum;

import java.util.ArrayList;
import java.util.Scanner;

public class pizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // TODO : her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            menu();
            secim= oku.nextInt();
            switch (secim){
                case 1://small ekle
                    pizza sp=new pizza(secenek.SMALL);
                    siparisler.add(sp);
                    break;
                case 2:
                    pizza mp=new pizza(secenek.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:
                    pizza lp=new pizza(secenek.LARGE);
                    siparisler.add(lp);
                    break;
                case 4:siparisYazdir(siparisler);
                break;
            }
        }while (secim<=4);

    }
    public static void menu()
    {
        System.out.println("***** Pizza Menu ******");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- İşleme al-Sipariş göster");
        System.out.println("5- Cıkıs");
        System.out.print("Seciminiz :");
    }
    public static void siparisYazdir(ArrayList<pizza>siparisler){
        int s=0,m=0,l=0;
        for (pizza p:siparisler){
            if (p.size==secenek.SMALL)s++;
            else
            if (p.size==secenek.MEDIUM)m++;
            else
            if (p.size==secenek.LARGE)l++;

            }
        System.out.println("*** Siparişleriniz ***");
        System.out.println("Small pizza count="+s);
        System.out.println("Medium pizza count="+m);
        System.out.println("Large pizza count="+l);
        }
    }

