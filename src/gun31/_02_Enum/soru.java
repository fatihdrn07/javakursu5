package gun31._02_Enum;

enum Role{ADMIN, MUDUR, SATIS, PERSONEL}
enum Statu{AKTIF, PASIF}
public class soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username, role, statu) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    public static void main(String[] args) {

     user user1=new user("ismet",Role.ADMIN,Statu.AKTIF);
     user user2=new user("fatih",Role.MUDUR,Statu.AKTIF);
     user user3=new user("mehmet",Role.SATIS,Statu.PASIF);

     usersil(user1);
     usersil(user2);
     usersil(user3);
        System.out.println("user1 = " + user1);
    }
    public static void usersil(user User)
    {
        if (User.role==Role.ADMIN)
        {
            System.out.println("ADMİN silinemez");
        }
    }

}


