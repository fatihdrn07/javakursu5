package gun30._02_FinalVeriables.ornek1;

public class nufusMemurlugu {
    public static void main(String[] args) {
        vatandas v1=new vatandas("ismet");
        vatandas v2=new vatandas("nazmiye");
        vatandas v3=new vatandas("nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456;
        //final değişkenlere sadece 1 kez veri atanabilir
        //o da ya tanımlanırken yada Constructor da
    }
}

// final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
// yeni artan değer almasını sağlıyor
