package gun40;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        // canlı dijital saat yapınız

        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true){
            LocalTime saat=LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.bekle(1);
        }

    }
}
