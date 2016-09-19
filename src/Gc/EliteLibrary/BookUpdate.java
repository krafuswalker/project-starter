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

   BookTextFile bt = new BookTextFile();

	public BookUpdate() {
		super();

	}

	public String searchAuthor(String authorKeyword) throws IOException {
        Scanner sc = new Scanner(System.in);

		
        System.out.println("Enter The author name");
		authorKeyword = sc.next().toLowerCase();
		String authorfound="Author not found";
		List<Book> bookList2=new ArrayList<>();

		List<Book> bookList = new ArrayList<>();
		BookTextFile br = new BookTextFile();
		bookList = br.readBookList();
		for (Book b : bookList) {
			//System.out.println(titleKeyword + "    " + b.getBookTitle().toLowerCase().contains(titleKeyword) );
			if (b.getBookAuthor().toLowerCase().contains(authorKeyword))
               
                
				authorfound = (getBookTitle()) + '\t' + b.getBookAuthor() + '\t' + b.getBookStatus();
		}
				
	    return authorfound;
	}

	
	
	
	
	
	
	
	
	public String searchKeyWord(String titleKeyword) throws IOException {

		Scanner sc = new Scanner(System.in);
		titleKeyword = sc.next().toLowerCase();
		String bookFound="book not found";
        
		List<Book> bookList = new ArrayList<>();
		BookTextFile br = new BookTextFile();
		bookList = br.readBookList();
		for (Book b : bookList) {
			//System.out.println(titleKeyword + "    " + b.getBookTitle().toLowerCase().contains(titleKeyword) );
			if (b.getBookTitle().toLowerCase().contains(titleKeyword))

				bookFound =b.getBookTitle() + '\t' + b.getBookAuthor() + '\t' + b.getBookStatus();
		}
				
	    return bookFound;
	}
		

	

}