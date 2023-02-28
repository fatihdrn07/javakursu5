package gun34._01_Protected.paket2;

import gun34._01_Protected.paket1.p1Hayvan;

public class p2Main {
    public static void main(String[] args) {
        p1Hayvan h=new p1Hayvan();
        h.ad="karabaş";
//        h.yas  defalut sadece kendi paketinden
//        h.cinsi protected defauld gibi
//        h.renk private sadece kendi classından

        kedi k=new kedi("kaymak","scotish");
        System.out.println("k = " + k);
    }
}
