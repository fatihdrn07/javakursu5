package gun28._03_Constructor;

public class book {
    String name;
    int publishYear;
    String author;

    public book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public book() {
    }

    public book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }

    //sağ tuş generate ( alt+insert ) -> constructor
}
