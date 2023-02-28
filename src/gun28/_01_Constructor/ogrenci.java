package gun28._01_Constructor;

public class ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public ogrenci(){  //yapıcı metodlar : Constructor methodlar
        System.out.println("nesne olusturuldu");
    }//nesne oluştururken yapmak istediklerin için burayı kullan

    public ogrenci(int id, String ad,String soyad,int sinifi){
        this.id=id; //this.id : classın id si  ,  id : local değişken parametersi
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;

    }
    public ogrenci(int id, String ad,String soyad) {
        this(id,ad,soyad,0);  // this oğrenci methodunun kendisi

//        this.id = id; //this.id : classın id si  ,  id : local değişken parametersi
//        this.ad = ad;
//        this.soyad = soyad;
//        this.sinifi = 0;
    }
}
