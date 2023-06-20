package Stack_Book;

public class Book {
	private int bookId;
	private String name;
	private int price;
	
	public Book() {
		super();
	}

	public Book(int bookId, String name, int price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
