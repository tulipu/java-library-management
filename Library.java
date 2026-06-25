import java.util.ArrayList;
public class Library{
ArrayList<Book> books = new ArrayList<>();
public void addBook(Book book) {
books. add (book);
}
public void displayBooks(){
for (Book book: books) 
{
System. out.println("ID= "+book.id) ;
System. out. println("Title= "+book. title);
System. out. println("Author= "+book.author);
System. out.println();
}
}
}
