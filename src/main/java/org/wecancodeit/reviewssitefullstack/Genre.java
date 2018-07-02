package org.wecancodeit.reviewssitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	
	@OneToMany(mappedBy = "genre")
	private Collection<Review> reviews;

	public Genre(String title) {
		this.title = title;
	}
	
	public Genre () {
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return title;
	}
	
	
	

}
