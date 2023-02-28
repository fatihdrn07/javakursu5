package gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanal={"CNN","Kanal D","Fox","TV8","Show"};

        int random=(int)(Math.random()* kanal.length);

        System.out.println(kanal[random]);


    }
}
