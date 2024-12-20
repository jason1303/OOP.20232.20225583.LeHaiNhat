package hust.soict.cybersec.aims.media;

import java.util.Comparator;

import hust.soict.cybersec.aims.cart.MediaComparatorByCostTitle;
import hust.soict.cybersec.aims.cart.MediaComparatorByTitleCost;

public abstract class Media {
	//instance attribute
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMAPRE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	//constructor
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost  = cost;
	}
	
	//getter and setter
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
	
	//method
	//overwrite equals (object class) 
	
	@Override
	public boolean equals (Object object) {
		if (object == null || (object instanceof Media)) {
			return false;
		}
		Media media = (Media) object;
		return this.title != null && this.title.equals(media.title) && this.cost == media.cost;
	}
	
	public int compareTo(Media other) {
		if (other == null) {
			throw new NullPointerException("The object is compare to is null");
			
		}
		int compareTitle = this.title.compareTo(other.getTitle());
		if (compareTitle != 0 ) {
			return compareTitle;
		}
		return Double.compare(this.cost, other.getCost());
		
	}
	//polymorphism with toString method
	public String toString() {
		String result = "";
		return result;
	}
	
	
	
	
	


	
	
	
	

}
