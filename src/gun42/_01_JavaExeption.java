package gun42;

public class _01_JavaExeption {
    public static void main(String[] args) {

        System.out.println("program çalışmaya başladı");
        String kelime="";  // önce ; koymadık bu COMPİLE error
        char harf=kelime.charAt(3);  // bu satırı en son ekledik, bu RUNTIME error
        System.out.println("program bitti");


    }
}

// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// derleme zamanı yani COMPPILE ERROR, Exception diyoruz

// program çalıştıktan sonra çalışma zamanı içerisinde ki hatalara
// çalışma zamanı yani RUNTIME ERROR. Exception diyoruz.
