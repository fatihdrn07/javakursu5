package _PROJE_._02_proje;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje {
    public static void main(String[] args) {

        List<String> actions = new ArrayList<>(Arrays.asList("Para Yatır", "Para Cek", "Transfer", "Cıkış"));
        List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<Integer> accounts = new ArrayList<>(Arrays.asList(1234, 5678, 9999));
        List<Integer> funds = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        while (true) {
            System.out.print("Kullanıcı adı:");
            String username = okuStr.nextLine();

            System.out.print("Password giriniz:");
            String password = okuStr.nextLine();

            if (confirmUsernameAndPassword(users, passwords, username, password)) {
                System.out.println("Başarılı bir şekilde giriş yaptınız");
                break;
            }
            System.out.println("Sistemde kayıtlı böyle bir kullanıcı bulunamadı... Tekrar deneyin:");
        }
        Scanner oku=new Scanner(System.in);
        int sayi=oku.nextInt();
        while (true) {


            switch (sayi) {
                case 1:
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");
                    break;
                case 2:
                    System.out.println("hangi hesaptan para çekmek istiyorusuz?");
                    System.out.println(accounts);
                    int secim = oku.nextInt();
                    System.out.println("Ne kadar para cekmek istiyorsunuz?");
                    int tutar = oku.nextInt();


            }
            break;
        }
    }

    public static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(username) && passwords.get(i).equals(password))
                return true;
        }
        return false;
    }

    public static void withdraw(){

    }
}
