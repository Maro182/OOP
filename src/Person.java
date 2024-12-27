import java.util.Date;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name= " + name + " , age=" + age;
    }
}

class Author extends Person {
    private int numberOfBooks;
    public Author(String name, int age, int numberOfBooks) {
        super(name, age);
        this.numberOfBooks = numberOfBooks;
    }

    public Book PublishBook(Book book) {
        numberOfBooks++;
        return book;
    }
    public Book publishBook(String title , Date date) {
        numberOfBooks++;
        return new Book(title , date , this);
    }
}

class Book {
    private String title;
    private Date date;
    Author author;

    public Book(){}

    public Book(String title, Date date , Author author) {
        this.title = title;
        this.date = date;
        this.author = author;
    }
    public void PrintAuthorName() {
        System.out.println(author.getName());
        }

        @Override
        public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", date= " + date +
                ", author : " + author +
                '}';
    }
    public static void main(String[] args) {
        Author author = new Author("omar" , 20 , 3);
        Book book = new Book("Man" , new Date() , author);

        System.out.println(author.PublishBook(book));

        author.publishBook("Man" , new Date()).PrintAuthorName();
    }
}
