package gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Ders ve notunu giriniz:");
        String dersvenot= oku.nextLine();
        int ind=dersvenot.indexOf(":");
        int ogrnot=Integer.parseInt(dersvenot.substring(ind+1));

        if (ogrnot>=90)
            System.out.println("A");
        else
            if (ogrnot>=80)
                System.out.println("B");
            else
                if (ogrnot>=70)
                    System.out.println("C");
                else
                    if (ogrnot>=60)
                        System.out.println("D");
                    else
                        if (ogrnot>=40)
                            System.out.println("D");
                        else
                                System.out.println("F");


    }
}
