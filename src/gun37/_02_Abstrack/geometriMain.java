package gun37._02_Abstrack;

public class geometriMain {
    public static void main(String[] args) {

        dikdortgen d=new dikdortgen(4,5);
        d.setName("yeni dikdörtgen");
        d.ciz();
        System.out.println(d);

        daire dr=new daire(4);
        dr.setName("yeni daire");
        dr.ciz();
        System.out.println(dr);
    }
}
