package hust.soict.cybersec.aims.media.disc;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	
	private String director;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
		this.director= director;	
		
	}
	
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
	
	public int getLength() {
		int result = 0 ;
		for (Track track : tracks) {
			result = result + track.getLength();
		}
		return result;
	}

	@Override
	public void Play() {
		for (Track track : tracks ) {
			track.Play();
		}
	}
	
	
	
	
	

}
