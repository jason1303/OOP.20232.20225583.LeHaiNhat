package hust.soict.cybersec.aims.media;

public class DigitalVideoDisc extends Media {
	
	private String director;
	private int length;
	
	//section 16: class attribute
	private static int nbDigitalVideoDisc = 0;
	
	//getter and setter 
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	//constructor method
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDisc += 1;
		id = nbDigitalVideoDisc;
		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		
		this.director = director;
		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
		this.director = director;
		this.length = length;
	}
	
	public int getID() {
		return id;
	}
	
	public String toString () {
		String result = "DVD - ";
		result = result +  this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost();
		return result;
	}
	
}
