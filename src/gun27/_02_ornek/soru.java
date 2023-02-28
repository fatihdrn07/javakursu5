package gun27._02_ornek;

public class soru {
    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.
    public static void main(String[] args) {

        int min       =mathMethodlar.getmin(58,45);
        double ust    =mathMethodlar.getustAl(2,5);
        double karekok=mathMethodlar.getkarakok(125);
        int max       =mathMethodlar.getmax(5,9);
        int random    =mathMethodlar.getrandom(26);

        System.out.println("random = " + random);
        System.out.println("max = " + max);
        System.out.println("karekok = " + karekok);
        System.out.println("ust = " + ust);
        System.out.println("min = " + min);

    }
}
