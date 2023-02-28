package gun20;

public class _07_odev {
    public static void main(String[] args) {
//1-Ismi **randomNum** olan bir method oluşturun.Parametre olarak **int max** almalı.
//Bu method, 0 ile max arasında random bir değer döndürmelidir.Random numarayı döndürünüz.

    int max=9;
        max=randomNum(9);
        System.out.println(max);


    }
    public static int randomNum (int sayi){
        sayi=(int)(Math.random()*9);
        return sayi;
    }
}
