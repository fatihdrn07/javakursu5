package gun30._01_StaticVariables.ornek2;

public class student {
    int id;
    String fullName;
    static  int sayac=1;  //sen bitanesin
    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.


    public student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        //maindeki ilk 3 değer için gerekli
        //stacik değişkenden sonra gerek kalmadı
    }
    public student( String fullName) {
        this.id = sayac++; //önce var olan değer veriliyor, sonra artıyor
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

