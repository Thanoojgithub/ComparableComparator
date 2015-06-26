package com.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Book> bookList = getBookList();
		for (Book b : bookList) {
			System.out.println(b);
		}

		System.out.println("\n-: Sorting using Comparable :-");
		doComparable(bookList);

		System.out.println("\n-: Sorting using Comparator :-");
		doComparator(bookList);
	}

	private static void doComparator(List<Book> bookList) {
		System.out.println("Technology sort");
		Collections.sort(bookList, new BookSortWithTechnology());
		for (Book b : bookList) {
			System.out.println(b);
		}
		System.out.println("Publisher sort");
		Collections.sort(bookList, new BookSortWithPublisher());
		for (Book b : bookList) {
			System.out.println(b);
		}
		System.out.println("Author sort");
		Collections.sort(bookList, new BookSortWithAuthor());
		for (Book b : bookList) {
			System.out.println(b);
		}
		System.out.println("Cost sort");
		Collections.sort(bookList, new BookSortWithCost());
		for (Book b : bookList) {
			System.out.println(b);
		}
	}

	private static void doComparable(List<Book> bookList) {
		Collections.sort(bookList);
		for (Book b : bookList) {
			System.out.println(b);
		}
	}

	private static List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();
		Book book = new Book();
		book.setAuthor("Kalathuru");
		book.setCost(123);
		book.setPublisher("Packt Publishing");
		book.setTechnology("Java");
		bookList.add(book);
		Book book1 = new Book();
		book1.setAuthor("Thanooj");
		book1.setCost(321);
		book1.setPublisher("McGraw Hill");
		book1.setTechnology("Spring");
		bookList.add(book1);
		return bookList;
	}
}
