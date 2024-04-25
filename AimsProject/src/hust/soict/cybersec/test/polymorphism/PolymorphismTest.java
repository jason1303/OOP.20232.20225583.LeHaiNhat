package hust.soict.cybersec.test.polymorphism;

import hust.soict.cybersec.aims.media.*;
import hust.soict.cybersec.aims.media.disc.CompactDisc;
import hust.soict.cybersec.aims.media.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class PolymorphismTest {

	public static void main (String[] args) {
		
		ArrayList<Media> mediae = new ArrayList<Media>();
		
		CompactDisc cd = new CompactDisc("Chung ta cua hien tai", "tinh cam",100000f, 999, "jason","sontungMTP");
		Book book = new Book("10 toi ac", "kinh di", 200f );
		DigitalVideoDisc dvd = new DigitalVideoDisc("sieu nhan dien quang","sieu nhan",50f, 500,"hainhat");
		
		mediae.add(cd);
		mediae.add(book);
		mediae.add(dvd);
		
		for(Media m : mediae) {
			System.out.println(m.toString());
		}
	}

}
