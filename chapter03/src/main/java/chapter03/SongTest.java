package chapter03;

import chapter03.Song;

public class SongTest {

	public static void main(String[] args) {
		
		
		Song song1 = new Song("좋은날", "아이유", "real", "이민수", 2010, 3);
		
		/*
		song1.setTitle("좋은날");
		song1.setArtist("아이유");
		song1.setAlbum("real");
		song1.setComposer("이민수");
		song1.setYear(2010);
		song1.setTrack(3);
		*/
		
		Song song2 = new Song("신호등", "이무진");
		song2.show();
		
		
	}

}
