package hust.soict.cybersec.aims.media.disc;

public class Track implements Playable{
	//instance attribute
	private String title;
	private int length;
	
	//constructor
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	//methods
	//overwrite equals (object class) to make tracks in the track list become unique
	public boolean equals(Object object) {
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Track track = (Track) object;
		if (this.title.equals(track.title) && this.getLength() == track.getLength()) {
			return false;
		}else {
			return true;
		}
		
	}
	
	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	

}
