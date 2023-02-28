package gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; //hafızada int kadar yer ayırıyor
        //sadece tam sayı atılabiliyor

        //tam sayilar
        byte bytedeger = 7; // -128   +128
        short shortdeger = 1645; // -32000   +32000
        int intdeger = 250000;
        long longdeger = 2332323454545L;

        //ondalıklı sayılar

        double doubledeger = 3.144545454555667;
        float floatdeger = 3.144343F;


        char basharf = 'A'; // bir tane karakter saklayabilir
        String isim = "fatih"; //kelime veya cümle saklayabilir


        System.out.println("bytedeger = " + bytedeger);
        System.out.println("shortdeger = " + shortdeger);
        System.out.println("floatdeger = " + floatdeger);
        System.out.println("doubledeger = " + doubledeger);
        System.out.println("longdeger = " + longdeger);
        System.out.println("basharf = " + basharf);
        System.out.println("isim = " + isim);

    }
}
