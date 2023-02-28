package gun34._01_Protected.paket2;

import gun34._01_Protected.paket1.p1Hayvan;

public class kedi extends p1Hayvan {

    public  kedi(String ad, String cinsi){
        super.ad=ad;
        super.cinsi=cinsi;
        // protected lara extra olarak extends yoluyla
        // diğer paketlerden erişilebilir
    }

    @Override
    public String toString() {
        return "kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }


}
