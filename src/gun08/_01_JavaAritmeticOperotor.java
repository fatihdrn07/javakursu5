package gun08;

public class _01_JavaAritmeticOperotor {
    public static void main(String[] args) {

        // modül işlemi:

        //modül (%) kalanı verir.
        //bölünen bölenden küçükse modül bölünendir yani küçük olan

        //sayac=sayac+1; --> sayacı 1 arttırır
        //sayac++; --> sayacı 1 arttırır
        //++sayac; --> sayacı 1 arttırır

        //sayac=sayac-1; --> sayacı 1 azaltır
        //sayac--; --> sayacı 1 azaltır
        //--sayac; --> sayacı 1 azaltır

        int toplam = 5;
        int sayac = 0;
        toplam = 5 + sayac++; // toplam=5+sayac sonra sayac=sayac+1
        toplam = 5 + ++sayac; // sayac=sayac+1 sonra toplam=5+sayac

        // özet:    ++ lar sağda ise önce işlem sonra artış
        //          ++ lar solda ise önce artış sonra işlem


    }
}
