package hust.soict.cybersec.aims.media.disc;

import java.util.ArrayList;

import hust.soict.cybersec.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{
	
	//instance attribute
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	//constructor 
	public CompactDisc(String title, String category, float cost, int length, String director,String artist) {
		super(title, category, cost, length, director);
		this.artist = artist;	
	}
	
	//getter method
	public String getArtist() {
		return artist;
	}
	
	public int getLength() {
		int result = 0 ;
		for (Track track : tracks) {
			result = result + track.getLength();
		}
		return result;
	}


	//method
	public void addTrack(Track track) {
		for (int i = 0 ; i < tracks.size() ; i++) {
			if(tracks.get(i) == track) {
				System.out.println("This track is already in the CD");
				return;
			}
		}
		tracks.add(track);
		System.out.println("This track is added to the CD");
	}
	
	public void removeTrack(Track track) {
		for (int i = 0 ; i < tracks.size() ; i++) {
			if(tracks.get(i) == track) {
				tracks.remove(i);
				System.out.println("This track is remove from the CD");
				return;
			}
		}
		System.out.println("This track is not in the CD");
	}
	
	
	@Override
	public void Play() throws PlayerException {
		if (this.getLength() > 0 ) {
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.Play();
				}catch (PlayerException e ) {
					throw e;
				}
			}
			
		}else {
			throw new PlayerException("ERROR: CD length is non-positive");
		}
		
	}
	
	
	public String toString () {
		String result = "CD - ";
		result = result +  this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": "  + this.artist + ": " + this.getCost();
		return result;
	}
	
	
	
	

}
