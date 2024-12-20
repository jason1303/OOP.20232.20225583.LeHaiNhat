package hust.soict.cybersec.test.disc;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "animation", 0, 0, null);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "animation", 0, 0, null);
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jung le dvd title: " + jungleDVD.getTitle());
		
		
	}
	public static void swap (Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle, oldTitle, 0, 0, oldTitle);
		
	}

}
