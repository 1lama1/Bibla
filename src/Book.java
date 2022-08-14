public class Book {
    private  String name1;
    private int age1 ;
    private  final  Author author1;

    public Book(String name1, int age1, Author author1) {
        this.name1 = name1;
        this.age1 = age1;
        this.author1 = author1;
    }

    public String getName1() {
        return name1;
    }

    public int getAge1() {
        return age1;
    }

    public Author getAuthor1() {
        return author1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
