package workshop.booktest;

import workshop.bookbiz.BookBiz;
import workshop.bookutil.BookUtil;
import workshop.magazine.Magazine;
import workshop.novel.Novel;
import workshop.util.TravelUtil;
import java.util.Scanner;


public class BookTest {
	public static void printMenu() {
		System.out.println("=== < ���� ���� ���α׷� > ===");
		System.out.println("1.��ü ���� ���� ��ȸ");
		System.out.println("2.��ü ���� ��ȸ");
		System.out.println("3.��ü �Ҽ� ��ȸ");
		System.out.println("4.���� ���� ������ ��ȸ");
		System.out.println("5.�Ҽ� ���ڸ� �˻�");
		System.out.println("6.�Ҽ� ���� �˻�(�ּҰ� ~ �ִ밪)");
		System.out.println("9.�ý��� ����");
		System.out.println("======================");
	}
	public static void main(String[] args) {
		BookBiz biz = new BookBiz();
		int menu = 0;
		
		do {
			printMenu();
			System.out.print("## �޴� �Է� :");
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
				 System.out.print("> �˻��� ���ڸ��� �Է��ϼ��� :");
				 String author = BookUtil.getUserInput();
				 BookUtil.printHead();
				 biz.searchNovelByAuthor(author.trim());
				 BookUtil.printTail();
				 break;
			 case 6 :  
				 System.out.print("> �˻��� �Ҽ� ������ �ּҰ��� �Է��ϼ��� :");
				 int minPrice = Integer.parseInt(BookUtil.getUserInput());
				 System.out.print("> �˻��� �Ҽ� ������ �ִ밪�� �Է��ϼ��� :");
				 int maxPrice = Integer.parseInt(BookUtil.getUserInput());
				 BookUtil.printHead();
				 biz.searchNovelByPrice(minPrice, maxPrice);
				 BookUtil.printTail();
				 break;	 
			 case 9 :
				 System.out.println("------------------------");
				 System.out.println("���α׷��� �����մϴ�. Bye~");
				 System.out.println("------------------------");
				 System.exit(0);
			 }
			}while(menu!=9);

		}
	

 }
