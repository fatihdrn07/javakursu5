package gun27._02_ornek;

public class mathMethodlar {

    public static int getmin(int a, int b){
        return Math.min(a, b);
    }
    public static int getmax(int a,int b){
        return Math.max(a, b);
    }
    public static int getrandom(int a){
        return (int)(Math.random()*a);
    }
    public static double getustAl(int a,int b){
        return Math.pow(a,b);
    }
    public static double getkarakok(int a){
        return Math.sqrt(a);
    }
}
