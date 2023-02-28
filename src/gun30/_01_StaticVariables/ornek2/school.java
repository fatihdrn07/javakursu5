package gun30._01_StaticVariables.ornek2;

public class school {
    public static void main(String[] args) {

        student ogr1=new student(1,"İsmet Temur");
        student ogr2=new student(2,"Mehmet Yılmaz");
        student ogr3=new student(3,"Beyza Demir");
        //Problem: hem id yi takip etmek zorundayım
        //hemde hata olasılığı yüksek

        student ogr10=new student("İsmet Temur");
        student ogr11=new student("Mehmet Yılmaz");
        student ogr12=new student("Beyza Demir");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}
