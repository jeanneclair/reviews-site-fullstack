package org.wecancodeit.reviewssitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	private String youtube;
	private int stars;
	
	
	@ManyToOne
	private Genre genre;
	
	@ManyToMany(mappedBy = "reviews")
	private Collection<Tag> tags;
	
	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;


	public Review(String songName, String bandName, String songLyrics, String imageUrl, Genre genre, String youtube, int stars, Comment...comments) {
		super();
		this.songName = songName;
		this.bandName = bandName;
		this.songLyrics = songLyrics;
		this.imageUrl = imageUrl;
		this.youtube = youtube;
		this.stars = stars;
		this.genre = genre;
		this.comments = Arrays.asList(comments);
	}

	public Review() {
		
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
	

	public String getYoutube() {
		return youtube;
	}


	public int getStars() {
		return stars;
	}


	public Genre getGenre() {
		return genre;
	}
	

	public Collection<Tag> getTags() {
		return tags;
	}
	
	public void addComment(Comment comment) {
		
		comments.add(comment);
	}
	
	public void addTag (Tag tag) {
		tags.add(tag);
	}
	
	
	public Collection<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", songName=" + songName + ", bandName=" + bandName + ", songLyrics=" + songLyrics
				+ ", imageUrl=" + imageUrl + ", youtube=" + youtube + ", stars=" + stars + ", genre=" + genre
				+ ", tags=" + tags + "]";
	}
	
}
	
