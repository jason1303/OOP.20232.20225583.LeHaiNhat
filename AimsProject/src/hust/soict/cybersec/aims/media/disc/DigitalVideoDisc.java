package hust.soict.cybersec.aims.media.disc;

public class DigitalVideoDisc extends Disc implements Playable {
	
	
	//constructor
	public DigitalVideoDisc (String title, String category,float cost, int length,String director) {
		super(title,category,cost,length,director);
	}
	
	
	//methods
	public String toString () {
		String result = "DVD - ";
		result = result +  this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost();
		return result;
	}
	
	@Override
	public void Play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	
	}
	
}
