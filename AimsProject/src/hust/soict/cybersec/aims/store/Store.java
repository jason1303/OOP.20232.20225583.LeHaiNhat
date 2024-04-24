package hust.soict.cybersec.aims.store;

import java.util.ArrayList;


import hust.soict.cybersec.aims.media.Media;

public class Store {
	
	ArrayList<Media> storeItems;
	
	//constructor
	public Store() {
		storeItems = new ArrayList<Media>();
	}
	
	public void addMedia(Media media) {
		storeItems.add(media);
	}
	
	public void removeMedia(Media media) {
		int index = -1;
		for (int i = 0 ; i<storeItems.size() ; i++) {
			if (storeItems.get(i) == media) {
				index = i;
			}
		}
		if (index != -1 ) {
			storeItems.remove(index);
		}else {
			System.out.println("This media is not available in the store");
		}
	}
	
	
	
}	
