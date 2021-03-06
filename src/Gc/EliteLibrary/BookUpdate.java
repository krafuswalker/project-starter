package Gc.EliteLibrary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookUpdate extends Book {
	Scanner sc = new Scanner(System.in);
	BookTextFile bt = new BookTextFile();

	public BookUpdate() {
		super();

	}

	
	public String searchAuthor(String authorKeyword) throws IOException {
		

		System.out.println("Enter The author name");
		authorKeyword = sc.next().toLowerCase();
		String authorfound = "";
		List<Book> bookList = new ArrayList<>();
		BookTextFile br = new BookTextFile();
		bookList = br.readBookList();
		for (Book b : bookList) {

			if (b.getBookAuthor().toLowerCase().contains(authorKeyword))

				authorfound += (b.getBookId()  + "\t\t" + b.getBookTitle() + "\n\t\t" + b.getBookAuthor() + "\n\t\t"
						+ b.getBookStatus()) + "\n";
		}
		
		
		return authorfound;
	}

	public String searchKeyWord(String titleKeyword) throws IOException {

		
		titleKeyword = sc.next().toLowerCase();
		String bookFound = "book not found";

		List<Book> bookList = new ArrayList<>();
		BookTextFile br = new BookTextFile();
		bookList = br.readBookList();
		for (Book b : bookList) {
			if (b.getBookTitle().toLowerCase().contains(titleKeyword))

				bookFound = b.getBookTitle() + '\t' + b.getBookAuthor() + '\t' + b.getBookStatus();
		}

		return bookFound;
		
	}

}
