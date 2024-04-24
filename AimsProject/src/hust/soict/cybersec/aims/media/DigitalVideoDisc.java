package hust.soict.cybersec.aims.media;

public class DigitalVideoDisc extends Disc {
	
	
	public DigitalVideoDisc (String title, String category,float cost, int length,String director) {
		super(title,category,cost,length,director);
	}
	
	
	
	public String toString () {
		String result = "DVD - ";
		result = result +  this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost();
		return result;
	}
	
}
