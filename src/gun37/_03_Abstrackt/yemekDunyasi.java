package gun37._03_Abstrackt;

public class yemekDunyasi {
    public static void main(String[] args) {
        baklava b = new baklava();
        b.setName("Saklava");
        b.madeIn();
        b.taste();

        GreekSalad g=new GreekSalad();
        g.setName("Greek Salad");
        g.madeIn();
        g.taste();

        cheeseCake c=new cheeseCake();
        c.setName("Cheese Cake");
        c.madeIn();c.taste();
    }
}
