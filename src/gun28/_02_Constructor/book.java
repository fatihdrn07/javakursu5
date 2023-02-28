package gun28._02_Constructor;

public class book {
    String name;
    int publishYear;
    String author;

    public book(){

    }

    public book(String name,int publishYear,String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }
    public book(String name,int publishYear){
        this(name,publishYear,"");
    }

    public String toString(){
        return name+" "+author+" "+publishYear;
    }
}
