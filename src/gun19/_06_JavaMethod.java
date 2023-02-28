package gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();                     // Math.random();
        merhabaYazFatih("Fatih");    // Math.Abs(-10);


        cokMerhabaYaz(5);
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
    }
    public static void merhabaYazFatih(String isim){

        System.out.println(isim+" merhaba");

    }
    public static void cokMerhabaYaz(int miktar){
        for (int i = 0; i < 5; i++) {
            System.out.println("Merhaba");
        }
    }

}
