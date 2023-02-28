package _odev2_;

public class _01_soru5 {
    public static void main(String[] args) {
        //5-**0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
        //Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
        //Eğer sayı çift sayıysa;
        //**This number is even and number is 0**
        //Eğer sayı tek sayıysa;
        //**This number is odd and number is 1**   yazdırmalıdır.

        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
                System.out.println("This number is even and number is "+i);
            else if (i%2!=0) {
                System.out.println("This number is odd and number is "+i);

            }

        }
    }
}
