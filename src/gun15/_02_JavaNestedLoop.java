package gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk
        //2*1=2
        //2+2=4
        //....

        //5(dahil) lere kadar halini yazdırın

        for (int i=1;i<=5;i++){

            for (int j=0;j<=10;j++)
                System.out.println(i+"x"+j+"="+i*j);

        }

    }
}
