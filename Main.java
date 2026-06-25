public class Main{
public static void main(String [] args) {
    Library library=new Library();
Book b1= new Book ("Harry Potter", "J.K. Rowling", 1);
Book b2= new Book ("The Hobbit", "J.R.R. Tolkien", 2);
library. addBook (b1); 
library. addBook (b2) ;
library. displayBooks () ;
}
}
