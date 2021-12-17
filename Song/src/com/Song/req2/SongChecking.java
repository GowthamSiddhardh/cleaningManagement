package com.Song.req2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;



public class SongChecking {
	private String name;
	private String artist;
	private String songType;
	private Double ratings;
	private int numberOfDownloads;
	private Date dateDownloaded;
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}
    public String getSongType() {
		return songType;
	}
    public void setSongType(String songType) {
		this.songType = songType;
	}
    public Double getRatings() {
		return ratings;
	}
    public void setRatings(Double ratings) {
		this.ratings = ratings;
	}


	public int getNumberOfDownloads() {
		return numberOfDownloads;
	}
    public void setNumberOfDownloads(int numberOfDownloads) {
		this.numberOfDownloads = numberOfDownloads;
	}
    public Date getDateDownloaded() {
		return dateDownloaded;
	}
    public void setDateDownloaded(Date dateDownloaded) {
		this.dateDownloaded = dateDownloaded;
	}
    public SongChecking(String name, String artist, String songType, Double ratings, int numberOfDownloads,
			Date dateDownloaded) {
		super();
		this.name = name;
		this.artist = artist;
		this.songType = songType;
		this.ratings = ratings;
		this.numberOfDownloads = numberOfDownloads;
		this.dateDownloaded = dateDownloaded;
	}
	public SongChecking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return "name=" + name + "\nartist=" + artist + "\nsongType=" + songType + "\nratings=" + ratings
				+ "\nnumberOfDownloads=" + numberOfDownloads + "\ndateDownloaded=" + sdf.format(dateDownloaded);
	}
	@Override
	public int hashCode() {
		return Objects.hash(artist, name, songType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SongChecking other = (SongChecking) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(name, other.name)
				&& Objects.equals(songType, other.songType);
	}

}
