package gun25;
//class-tiplerin tanımlandığı yer
public class _01_JavaClasAndObject {

    //methodların yazıldığı yer
    public static void main(String[] args) {
        //ana programın çalıştığı yer

        Araba benimArabam=new Araba();// Araba tür, tip adı, benimArabam nesne
        benimArabam.marka="BMW";
        benimArabam.renk="Beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2018;

        System.out.println("benimArabam yili= "+benimArabam.yili);
        System.out.println("benimArabam markası= "+benimArabam.marka);
        System.out.println("benim arabam rengi= "+benimArabam.renk);
        System.out.println("benim arabam motorhacmi= "+benimArabam.motorHacmi);

    } //dur

    //methodların yazıldığı yer
}

//class-tiplerin tanımlandığı yer

class Araba{
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}
