package workshop.magazine;

import workshop.book.Book;

public class Magazine extends Book{
	
	private String category;
	private String description;
	
	public Magazine(String title, int price, String category, String description) {
		super(title, price);
		this.category = category;
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public String getDescription() {
		return description;
	}
	public String toString() {
		return "[제목]"+getTitle()+"\t"+"[가격]"+getPrice()+"\t"+"[분류]"+getCategory()+"[비고]"+getDescription();
	}
}
