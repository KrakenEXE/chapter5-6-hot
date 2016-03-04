import java.io.IOException;

public class Library {

private Book book;
private String name;
	
public Library(Book b,String n)
{
	book = b;
	name = n;
}

public String toString()
{
	return book.toString() + " The library's name is " + name;
}


	public static void main(String[] args) {
	
		Book newbook = new Book("A Million Dollar Title", "Mr Author", "Mr Publisher");
		Library mattsLib = new Library(newbook,"Matt's LIbrary");
		System.out.println(mattsLib.toString());
		
	}
	
}
