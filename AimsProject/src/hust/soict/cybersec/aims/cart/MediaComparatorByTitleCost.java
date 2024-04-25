package hust.soict.cybersec.aims.cart;

import java.util.Comparator;

import hust.soict.cybersec.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	
	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		int result = o1.getTitle().compareToIgnoreCase(o2.getTitle());
		
		if (result == 0) {
			if (o1.getCost() > o2.getCost()) {
				result = 1;
			}else if (o1.getCost() < o2.getCost()) {
				result = -1;
			}else result = 0;
		}
		return result;
	}

}
