public class Homework {
    public static void main(String[] args) {
       Author DeSad = new Author("De","Sad");
       Book Dead = new Book("Dead",1996,DeSad);

        Author IvanIv = new Author("Ivan","Iv");
        Book War = new Book("Dead",1996,IvanIv);

        War.setAge1(1700);

        System.out.println(Dead);
        System.out.println(War);


    }
}
