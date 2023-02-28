package gun29._01_ClassErisimleri.paketIki;

import gun29._01_ClassErisimleri.paketBir.PublicErisim;

public class DigerPaketMain {
    public static void main(String[] args) {
        PublicErisim pe=new PublicErisim();
        //DefaultErisim de=new DefaultErisim();
        // diğer paketlerden default belirtecli class a erişilemez
        // yanlızca kendi paketindekiler erişebilir
    }
}
