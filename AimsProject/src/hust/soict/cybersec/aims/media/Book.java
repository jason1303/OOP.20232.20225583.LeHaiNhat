package hust.soict.cybersec.aims.media;

import java.util.ArrayList;	
import java.util.List;

public class Book extends Media{
	
	private static int nbBook = 0;
	public List<String> authors = new ArrayList<String>();

	public Book(String title, String category, float cost) {
		super(title,category,cost);
		id = nbBook;
		nbBook += 1;
	}
	public Book (String title, float cost) {
		super(title,cost);
		id = nbBook;
		nbBook += 1;;
	}
	public Book(String title, String category) {
		super(title,category);
		id = nbBook;
		nbBook += 1;
	}
	public Book(String title) {
		super(title);
		id = nbBook;
		nbBook += 1;
	}

	public void addAuthor(String authorName) {
		for(int i = 0 ; i < authors.size(); i++) {
			if (authors.get(i) == authorName) {
				System.out.println("This author is already existed");
				return;
			}
		}
		authors.add(authorName);
		System.out.println("The author is added successfully");
		return;
		
	}
	
	public void removeAuthor (String authorName) {
		for(int i = 0 ; i < authors.size(); i++) {
			if (authors.get(i) == authorName) {
				authors.remove(i);
				System.out.println("This author is remove successfully");
				return;
			}
		}
		System.out.println("This author is not exist");
	}
}
