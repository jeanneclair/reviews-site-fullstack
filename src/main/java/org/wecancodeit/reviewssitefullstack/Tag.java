package org.wecancodeit.reviewssitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@JsonIgnore
	@ManyToMany 
	private Collection<Review> reviews;
	
	public Tag(String name, Review...reviews) {
		this.name = name;
		this.reviews = Arrays.asList(reviews);
	}

	public Tag() {
		
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	
	public void addReview(Review review) {
	
		reviews.add(review);
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + ", reviews=" + reviews + "]";
	}
	
}
