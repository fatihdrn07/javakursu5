package gun07;

import java.util.Locale;
import java.util.Scanner;

public class _15_odev {
    public static void main(String[] args) {
        /* ---------------------------  ÖZEL SORULAR  --------------------------------- */

        // 1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("isim:");
        String isim = oku.nextLine();
        System.out.print("soyisim:");
        String soyisim = oku.nextLine();
        System.out.println("isim soyisim:" + isim.concat("".concat(soyisim)));

        //2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        System.out.print("kelime:");
        String kelime2 = oku.nextLine();
        System.out.println("kelime.isEmpty() = " + kelime2.isEmpty());

        //3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

        System.out.print("cümle giriniz:");
        String text3 = oku.nextLine();
        String ametin = text3.replaceAll("[^aA]", "");
        int asayi = ametin.length();
        System.out.println("a sayısı:" + asayi);


        //4- girilen bir kelimenin ilk ve son harfini bulunuz.

        System.out.print("kelime giriniz: ");
        String text4 = oku.nextLine();
        System.out.println("ilk harf = " + text4.charAt(0));
        int uzunluk4 = text4.length();
        char sonharf = text4.charAt(uzunluk4 - 1);
        System.out.println("sonharf = " + sonharf);

        //5- girilen bir cümledeki ilk kelimeyi yazdırınız

        System.out.print("cümle giriniz:");
        String text5 = oku.nextLine();
        System.out.println("text5.substring() = " + text5.substring(0, text5.indexOf(" ")));

        //6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        System.out.print("3 kelimelik cumle giriniz:");
        String tex6 = oku.nextLine();
        int index1bosluk = tex6.indexOf(" ");
        int index2bosluk = tex6.indexOf(" ", index1bosluk + 1);
        System.out.println("ilk 2 kelime: " + tex6.substring(0, index2bosluk));

        //7- Girilen bir cümlede kaç kelime olduğunuz bulunuz

        System.out.print("bir cümle giriniz:");
        String text7 = oku.nextLine();
        String bosluk = text7.replaceAll("[^ ]", "");//boşluk dışındaki bütün karakterleri sildim
        System.out.println("kelime sayisi: " + bosluk.length() + 1);//kelime sayısı boşluk sayısının 1 fazlasıdır


        //8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız

        System.out.println("bir cümle giriniz: ");
        String text8 = oku.nextLine();


        //9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        System.out.print("isminizi giriniz:");
        String text9 = oku.nextLine();
        char harf1 = text9.charAt(0);
        int indexisim1 = text9.indexOf(" ");
        char harf2 = text9.charAt(indexisim1 + 1);
        int indexisim2 = text9.indexOf(" ", indexisim1 + 1);
        char harf3 = text9.charAt(indexisim2 + 1);
        System.out.println(+harf1 + "." + harf2 + "." + harf3 + ".");


    }
}
