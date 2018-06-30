package org.wecancodeit.reviewssitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private String songName;
	private String bandName;
	@Lob
	private String songLyrics;
	private String imageUrl;
	private int stars;
	
	public Review() {
		
	}
	
	@ManyToOne
	private Genre genre;


	public Review(String songName, String bandName, String songLyrics, String imageUrl, Genre genre, int stars) {
		super();
		this.songName = songName;
		this.bandName = bandName;
		this.songLyrics = songLyrics;
		this.imageUrl = imageUrl;
		this.stars = stars;
		this.genre = genre;
	}


	public Long getId() {
		return id;
	}


	public String getSongName() {
		return songName;
	}


	public String getBandName() {
		return bandName;
	}


	public String getSongLyrics() {
		return songLyrics;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public int getStars() {
		return stars;
	}


	public Genre getGenre() {
		return genre;
	}


	@Override
	public String toString() {
		return "Review [songName=" + songName + ", bandName=" + bandName + ", songLyrics=" + songLyrics + ", imageUrl="
				+ imageUrl + ", stars=" + stars + ", genre=" + genre + "]";
	}

	
}
	
