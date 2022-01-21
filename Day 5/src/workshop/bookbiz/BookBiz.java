package workshop.bookbiz;

import workshop.magazine.Magazine;
import workshop.novel.Novel;
import workshop.book.Book;

public class BookBiz {

	private Magazine[] magazines;
	
	private Novel[] novels;
	
	public BookBiz() {
		magazines = new Magazine[] {
				new Magazine("[力格] Cooking Light", 15000, "[盒幅] living, cooking", "[厚绊] America Cooking"),
				new Magazine("[力格] Auto Bild", 16000, "[盒幅] science, car", "[厚绊] Germany Car"),
		};
		novels = new Novel[] {
				new Novel("[力格] The Confession", 10500 , "[历磊] Grisham, john"),
				new Novel("[力格] Les Miserables",  17500, "[历磊] Hugo, Vitor"),
				new Novel("[力格] Breakthrough",  47200, "[历磊] Ifill, Gwen"),
				new Novel("[力格] The Racjeteer", 38000, "[历磊] Grisham, John")
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
		                 + calculateOneYearSubscriptionPrice(m.getPrice()) +"盔");
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
