package hust.soict.aims.screen.manager;

public interface UpdateStore {
	public void addbook(String title, String category,Float cost);
	public void addDVD(String title, String category,Float cost,int length, String director);
	public void addCD(String title, String category,Float cost,int length, String director,String artist);
}
