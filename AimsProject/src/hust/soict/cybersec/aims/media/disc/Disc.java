package hust.soict.cybersec.aims.media.disc;

import hust.soict.cybersec.aims.media.Media;

public class Disc extends Media{
	//instance attribute
	private int length;
	private String director;
	
	//constructor
	public Disc(String title,String category,float cost,int length,String director) {
		super(title,category,cost);
		this.length = length;
		this.director = director;
	}
	
	//getter method
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
	
	

}
