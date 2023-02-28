package gun29.soru;

public class hesap {
    private int toplamyatan=0;
    private int toplamcekilen=0;
    private int toplambakiye=0;

   public void paraYatir(int yatanpara){
        toplamyatan = yatanpara;
        toplambakiye+=yatanpara;

    }
   public void paraCek(int cekilenPara){
        toplamcekilen+=cekilenPara;
        toplambakiye-=cekilenPara;
    }

    @Override
    public String toString() {
        return "hesap{" +
                "toplamyatan=" + toplamyatan +
                ", toplamcekilen=" + toplamcekilen +
                ", toplambakiye=" + toplambakiye +
                '}';
    }
}
