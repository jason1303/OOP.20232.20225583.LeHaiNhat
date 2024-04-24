package hust.soict.cybersec.aims.disc;

public class DigitalVideoDisc {
	
	// instance attribute
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	//section 16: class attributre
	private static int nbDigitalVideoDisc = 0;
	//getter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	

	
	//constructor method
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public void setTitle(String title2) {
		this.title = title2;
		
	}
	public int getID() {
		return this.id;
	}
	
	public String toString () {
		String result = "DVD - ";
		result = result +  this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost();
		return result;
	}
	
}
