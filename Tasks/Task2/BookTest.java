public class BookTest {
    public static void main(String[] args)
    {
        Book book1 = new Book("abc", "123", 1000);
        Book book2 = new Book("def", "123", 1006);
        Book book3 = new Book("ghi", "123", 1009);
        Book[] books = {book2, book3, book1};
        BookShelf bookShelf = new BookShelf(books);
        bookShelf.sort();
        int a = bookShelf.oldest().getDate();
        int b = bookShelf.youngest().getDate();
    }
}

class Book {
    private String name;
    private int date;
    private String author;
    Book()
    {}
    Book(String name, String author, int date)
    {
        this.name = name;
        this.author = author;
        this.date = date;
    }
    public String getName() {return name;}
    public String getAuthor() {return author;}
    public int getDate() {return date;}
    public void setName(String name) {this.name = name;}
    public void setAuthor(String author) {this.author = author;}
    public void setDate(int date) {this.date = date;}
    @Override
    public String toString() {return name + ", " + author + ", " + date;}
}

class BookShelf
{
    public Book[] books;
    private int sz = 0;
    BookShelf()
    {}
    BookShelf(int size)
    {
        books = new Book[size];
    }
    BookShelf(Book[] b)
    {
        books = b;
        sz = b.length;
    }
    public void put_back(Book book)
    {
        if (sz != books.length) {
            books[sz] = book;
            ++sz;
        }
    }
    public void put_back(String name, String author, int date)
    {
        if (sz != books.length)
        {
            books[sz].setName(name);
            books[sz].setAuthor(author);
            books[sz].setDate(date);
            ++sz;
        }
    }
    private int find(String name)
    {
        int index = -1;
        for (int i = 0; i != sz; ++i)
        {
            if (books[i].getName().equals(name))
            {
                index = i;
                break;
            }
        }
        return index;
    }
    public void delete_book(String name)
    {
        int index = find(name);
        if (index != -1) {
            for(int i = index; i + 1 < sz; ++i) {
                books[i] = books[i + 1];
            }
            --sz;
        }
    }
    public Book oldest()
    {
        int index = 0;
        int age = books[0].getDate();
        for (int i = 1; i != sz; ++i)
        {
            if (books[i].getDate() < age){
                age = books[i].getDate();
                index = i;
            }
        }
        return books[index];
    }
    public Book youngest()
    {
        int index = 0;
        int age = books[0].getDate();
        for (int i = 1; i != sz; ++i)
        {
            if (books[i].getDate() > age){
                age = books[i].getDate();
                index = i;
            }
        }
        return books[index];
    }
    public void sort() {
        for (int i = 1; i != sz; ++i){
            for(int j = i; j != 0; --j){
                if (books[j].getDate() < books[j - 1].getDate()){
                    Book temp = books[j];
                    books[j] = books[j - 1];
                    books[j - 1] = temp;
                } else break;
            }
        }
    }

    public int size() {return sz;}

}
