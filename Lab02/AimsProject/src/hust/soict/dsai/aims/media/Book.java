package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	public List<String> authors = new ArrayList<String>();

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
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
