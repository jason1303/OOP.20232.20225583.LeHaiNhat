package hust.soict.cybersec.aims.media;

public abstract class Media {
	//instance attribute
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
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
	public boolean equals (Object object) {
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Media media = (Media) object;
		return this.title.equals(media.title);
	}
	
	//polymorphism with toString method
	public String toString() {
		String result = "";
		return result;
	}
	


	
	
	
	

}
