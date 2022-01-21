package workshop.booktest;

import workshop.bookbiz.BookBiz;
import workshop.bookutil.BookUtil;
import workshop.magazine.Magazine;
import workshop.novel.Novel;
import workshop.util.TravelUtil;
import java.util.Scanner;


public class BookTest {
	public static void printMenu() {
		System.out.println("=== < 도서 정보 프로그램 > ===");
		System.out.println("1.전체 도서 정보 조회");
		System.out.println("2.전체 잡지 조회");
		System.out.println("3.전체 소설 조회");
		System.out.println("4.잡지 연간 구독료 조회");
		System.out.println("5.소설 저자명 검색");
		System.out.println("6.소설 가격 검색(최소값 ~ 최대값)");
		System.out.println("9.시스템 종료");
		System.out.println("======================");
	}
	public static void main(String[] args) {
		BookBiz biz = new BookBiz();
		int menu = 0;
		
		do {
			printMenu();
			System.out.print("## 메뉴 입력 :");
			menu = Integer.parseInt(TravelUtil.getUserInput()); 
			 switch(menu) {
			 case 1 :  
				 BookUtil.printHead();
				 biz.printAllBooks();
				 BookUtil.printTail(); break;
			 case 2 :  
				 BookUtil.printHead();
				 biz.printAllMagazines();
				 BookUtil.printTail();break;
				 
			 case 3 :  
				 BookUtil.printHead();
				 biz.printAllNovels();
				 BookUtil.printTail();break;
			 case 4 :  
				 System.out.println("------------------------");
				 biz.printMagazineOneYearSubscription(); 
				 System.out.println("------------------------");
				 break;
			 case 5 :  
				 System.out.print("> 검색할 저자명을 입력하세요 :");
				 String author = BookUtil.getUserInput();
				 BookUtil.printHead();
				 biz.searchNovelByAuthor(author.trim());
				 BookUtil.printTail();
				 break;
			 case 6 :  
				 System.out.print("> 검색할 소설 가격의 최소값을 입력하세요 :");
				 int minPrice = Integer.parseInt(BookUtil.getUserInput());
				 System.out.print("> 검색할 소설 가격의 최대값을 입력하세요 :");
				 int maxPrice = Integer.parseInt(BookUtil.getUserInput());
				 BookUtil.printHead();
				 biz.searchNovelByPrice(minPrice, maxPrice);
				 BookUtil.printTail();
				 break;	 
			 case 9 :
				 System.out.println("------------------------");
				 System.out.println("프로그램을 종료합니다. Bye~");
				 System.out.println("------------------------");
				 System.exit(0);
			 }
			}while(menu!=9);

		}
	

 }
