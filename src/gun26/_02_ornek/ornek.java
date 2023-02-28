package gun26._02_ornek;

public class ornek {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.
    public static void main(String[] args) {

        person cal1=new person();
        cal1.name="Fatih";
        cal1.surName="Duran";
        cal1.age=26;

        person cal2=new person();
        cal2.name="Rıdvan";
        cal2.surName="Celen";
        cal2.age=32;

        cal1.bilgiYazdir();
        cal2.bilgiYazdir();


        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

        cal1.getBirthYear();
        cal2.getBirthYear();

        cal1.getInitials();
        cal2.getInitials();
    }
}
