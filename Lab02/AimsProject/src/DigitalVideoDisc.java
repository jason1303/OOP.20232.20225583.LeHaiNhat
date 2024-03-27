
public class DigitalVideoDisc {
	// instance ID
	private int id;

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	//section 16:
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
	
}
