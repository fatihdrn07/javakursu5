package gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matnotlari=new ArrayList<>();
        ArrayList<Integer>fiznotlari=new ArrayList<>();
        ArrayList<Integer>kimnotlari=new ArrayList<>();

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiznotlari.add(30);
        fiznotlari.add(45);

        kimnotlari.add(60);
        kimnotlari.add(70);
        kimnotlari.add(80);
        kimnotlari.add(90);

        //ArrayList in ArrayList i nasıl yaparım
        ArrayList<ArrayList<Integer>>notlarlistesi=new ArrayList<>();
        notlarlistesi.add(matnotlari);
        notlarlistesi.add(fiznotlari);
        notlarlistesi.add(kimnotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String>dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");



        for (int i = 0; i <notlarlistesi.size(); i++) {

            System.out.print(dersler.get(i)+" : ");
            for (int j = 0; j < notlarlistesi.get(i).size(); j++) {
                System.out.print(notlarlistesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }

        //soru2
        //kullanıcıdan istediği bir dersin nosunu alarak(0-mat, 1-fiz, 2-kim)
        //sadece istediği derse ait notları bir metodda yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("0-mat, 1-fiz, 2-kim");
        int dersNo=oku.nextInt();

        dersNotlariniYazdir(notlarlistesi,dersNo);

        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını
        // bir metodda yazdırınız.

        dersNotlariniYazdir2(notlarlistesi,dersNo);

    }
    public static void dersNotlariniYazdir2(  ArrayList<ArrayList<Integer>>notlarlistesi, int dersno){

        int toplam=0;
        for (int i = 0; i < notlarlistesi.get(dersno).size(); i++) {
            toplam=toplam+notlarlistesi.get(dersno).get(i);
        }

        int ort=toplam/ notlarlistesi.get(dersno).size();

        int gecensayisi=0;
        for (int i = 0; i < notlarlistesi.get(dersno).size(); i++) {
            if ( notlarlistesi.get(dersno).size()>ort)
                gecensayisi++;
        }
        System.out.println(ort);
        System.out.println(gecensayisi);


    }
    public static void dersNotlariniYazdir(  ArrayList<ArrayList<Integer>>notlarlistesi, int dersno){

        for (int i = 0; i < notlarlistesi.get(dersno).size(); i++) {
            System.out.print(notlarlistesi.get(dersno).get(i));
        }


    }
}
