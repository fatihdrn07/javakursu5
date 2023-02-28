package gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //math.max yöntemi ile girilen 3 sayıdan büyük olanı bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi1: ");
        int sayi1= oku.nextInt();
        System.out.print("sayi2: ");
        int sayi2= oku.nextInt();
        System.out.print("sayi3: ");
        int sayi3= oku.nextInt();
        System.out.println("en büyük sayi:"+Math.max(sayi1,Math.max(sayi2,sayi3)));


    }
}
