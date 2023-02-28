package gun29._02_ClassErisimleri;

public class Calisan {
    int id;                  //default
    String name;             //default
    String surname;          //default
    private String password; //default

    public void sifreAta(String sifre){
        if (sifre.length()<8){
            System.out.println("zayıf sifre");
        }
        else {
            password=sifre;
            System.out.println("sifre basarıyla atandı");
        }
    }
    public void sifreGoster(){
        System.out.println("****"+password.substring(4));
    }
}
