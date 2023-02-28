package gun41;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        // Stringlerde neden == yerine equals kullanılıyor ?

        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        // İLKEL tipleri karşılaştırdığından 2 sinde de DEĞERLERİ KARŞILAŞTİRIR
        // ÇÜNKÜ başka bir şeyi yok
        if (cumle1==cumle2)
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit DEĞİL");

        if (cumle1.equals(cumle2))
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit DEĞİL");


        //************** REFERANS Tiplerde ise durum **************
        // scanner le ekrandan okuduğunda aşağıda ki gibi oluyor

        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if (cumle3==cumle4)
            System.out.println("cümle 3 cümle 4 ye eşit");
        else
            System.out.println("cümle 3 cümle 4 ye eşit DEĞİL");

        if (cumle3.equals(cumle4))
            System.out.println("cümle 3 cümle 4 ye eşit");
        else
            System.out.println("cümle 3 cümle 4 ye eşit DEĞİL");

    }
}
