package gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {

        //Math.Random() : sayı üretir. 0-0,9999999999 arası üretiyor

        double randsayi=Math.random();
        System.out.println("randsayi = " + randsayi);

        //0-6 üretsin
        //6 ile çarparım
        //0-5,999999
        //int çevirirsem 0-5 arası

        int rndtamsayi=(int)(Math.random()*6);
        System.out.println("rndtamsayi = " + rndtamsayi);
    }
}
