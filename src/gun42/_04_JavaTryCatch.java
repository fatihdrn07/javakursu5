package gun42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try {


            Scanner oku = new Scanner(System.in);

            System.out.println("sayi1=");
            int sayi1 = oku.nextInt();

            System.out.println("sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

//            String kelime="";    // genel hataya düşmesi için yapıldı
//            kelime.charAt(3);

        }
        catch (InputMismatchException ex){  // belirli bir hata
            System.out.println("lütfen sayi giriniz");
        }
        catch (ArithmeticException ex){  // belirli bir hata
            System.out.println("sıfıra bölme hatası");
        }
        catch (Exception ex){  // yukarıdakilerin dışında hatalar için
            System.out.println("hata oluştu= "+ex.getMessage());
        }


        System.out.println("program bitti");
    }
}
