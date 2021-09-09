package chapter03;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	public Song (String title, String artist){
		//this.title = title;
		//this.artist = artist;
		//some code...
		
		this(title, artist, null, null, 0, 0);
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		//this(title, artist, album, composer, year, track);

	}
	
	public void show(){
		System.out.println("제목 : " + getTitle()
		+ "\n가수 : " + getArtist()
		+ "\n앨범 : " + getAlbum()
		+ "\n작곡가 : " + getComposer()
		+ "\n발표 연도 : " + getYear()
		+ "\n앨범 트랙 : " + getTrack());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

}
