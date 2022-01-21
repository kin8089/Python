package workshop.novel;

import workshop.book.Book;


public class Novel extends Book{
	
	private String author;
	
	public Novel(String title, int price, String author) {
		super(title, price);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
		public String toString() {
			return "[제목]"+getTitle()+"[저자]"+getAuthor()+"\t"+"[가격]"+getPrice();
	}
}
