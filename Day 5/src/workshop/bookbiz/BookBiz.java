package workshop.bookbiz;

import workshop.magazine.Magazine;
import workshop.novel.Novel;
import workshop.book.Book;

public class BookBiz {

	private Magazine[] magazines;
	
	private Novel[] novels;
	
	public BookBiz() {
		magazines = new Magazine[] {
				new Magazine("[����] Cooking Light", 15000, "[�з�] living, cooking", "[���] America Cooking"),
				new Magazine("[����] Auto Bild", 16000, "[�з�] science, car", "[���] Germany Car"),
		};
		novels = new Novel[] {
				new Novel("[����] The Confession", 10500 , "[����] Grisham, john"),
				new Novel("[����] Les Miserables",  17500, "[����] Hugo, Vitor"),
				new Novel("[����] Breakthrough",  47200, "[����] Ifill, Gwen"),
				new Novel("[����] The Racjeteer", 38000, "[����] Grisham, John")
		};
	}
	public void printAllBooks() {
		int no = 1;
		for(Magazine m : magazines)
			System.out.println(no++ +"." +m.toString());
		for(Novel n : novels)
			System.out.println(no++ +"." +n.toString());
	}
	public void printAllMagazines() {
		int no = 1;
		for(Magazine m : magazines)
			System.out.println(no++ +"." +m.toString());
	}
	public void printAllNovels() {
		int no = 1;
		for(Novel n : novels)
			System.out.println(no++ +"."+n.toString());
	}
	private int calculateOneYearSubscriptionPrice(int price) {
		return price*12;
	}
	public void printMagazineOneYearSubscription() {
		int no = 1;
		for(Magazine m : magazines)
			System.out.println(no+++"." + m.getTitle() +" : " 
		                 + calculateOneYearSubscriptionPrice(m.getPrice()) +"��");
	}
	public void searchNovelByAuthor(String author) {		
		int no = 1;
		for(Novel n : novels) {
			if (n.getAuthor().equals(author))
			System.out.println(no+++"." +n.toString());
		}
	}
	
	public void searchNovelByPrice(int minPrice, int maxPrice) {
		int no = 1;
		for(Novel n : novels) {
			if (n.getPrice()>=minPrice && n.getPrice()<=maxPrice)
			System.out.println(no+++"." +n.toString());
		}
	}
	
}
