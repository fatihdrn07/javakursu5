package gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        int enb = Math.max(4, 5);

        enb = enbBul(4, 5);
        System.out.println("enb=" + enb);
// fonksiyonda return olduğu için main de yazdırabiliyoruz
// yani fonksiyonun sonucunu alabiliyoruz

    }

    public static int enbBul(int a, int b) {
        int donecek = 0;
        if (a > b)
            donecek = a;
        else
            donecek = b;
        return donecek;
    }
}
