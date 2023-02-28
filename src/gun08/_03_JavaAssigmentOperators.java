package gun08;

public class _03_JavaAssigmentOperators {
    public static void main(String[] args) {

        int a=10;

        //a=a+5;   a 15 olur
        a+=5;      //yine aynı 15 olur
        System.out.println("a = " + a);


        int b=10;
        //b=b-5;     b 5 oldu
        b-=5;      // yine aynı 5 oldu
        // b nin azalış miktarı 5 dir.
        System.out.println("b = " + b);


        int c=10;
        //c=c/5;     2 olur
        c/=5;       // aynı 2 olur
        //c nin bölüm değeri 5 dir
        System.out.println("c = " + c);


        int d=10;
        //d=d*5;    50 olur
        d*=5;      // aynı 50 olur
        //d nin çarpım değeri 5 dir
        System.out.println("d = " + d);


    }
}
