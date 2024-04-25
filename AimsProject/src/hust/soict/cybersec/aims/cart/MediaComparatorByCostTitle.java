package hust.soict.cybersec.aims.cart;

import java.util.Comparator;

import hust.soict.cybersec.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Media o1, Media o2) {
		int result;
		if (o1.getCost() > o2.getCost()) {
			result = 1;
		}else if (o1.getCost() < o2.getCost()) {
			result = -1;
		}else {
			result = 0;
		}
		if (result == 0) {
			result = o1.getTitle().compareToIgnoreCase(o2.getTitle());
		}
		return result;
	}

}
