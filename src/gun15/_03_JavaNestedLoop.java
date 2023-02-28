package gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1


        for (int i=5; i>0;i--){

            for (int j=i;j>0;j--)
                System.out.print("*");

            System.out.println();
        }
    }
}
