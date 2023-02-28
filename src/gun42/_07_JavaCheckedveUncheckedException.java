package gun42;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {
        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String srt="";

        char ilkHarf=srt.charAt(0);
        // sen bilirsin ister try-catch kullan ister kullanma : Unkhecked Exeption

        try {
            Thread.sleep(1000);  // try-catch mecbur : Checked Exception
        } catch (InterruptedException ex){
            System.out.println("hata oluştu");
        }

    }
}
