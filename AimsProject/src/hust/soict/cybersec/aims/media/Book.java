package hust.soict.cybersec.aims.media;

import java.util.ArrayList;	
import java.util.List;

public class Book extends Media{
	
	//instance attribute
	private static int nbBook = 0;
	public List<String> authors = new ArrayList<String>();
	
	//constructor
	public Book(String title, String category, float cost) {
		super(title,category,cost);
		id = nbBook;
		nbBook += 1;
	}

	//methods
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
	
	public String toString () {
		String result = "Book - ";
		result = result +  this.getTitle() + " - " + this.getCategory() + " - " + this.getCost();
		return result;
	}
}
