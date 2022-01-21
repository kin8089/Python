package workshop.book;

public class Book {
	private String title;
	private int price;
	
	public Book() {
		super();
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "[제목]"+getTitle()+"\t"+"[가격]"+getPrice();
	}
}