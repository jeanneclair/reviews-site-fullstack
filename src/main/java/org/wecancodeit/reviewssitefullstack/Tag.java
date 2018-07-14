package org.wecancodeit.reviewssitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ManyToMany // (mappedBy = "tags")
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

	@Override
	public String toString() {
		return "Tag [name=" + name + ", reviews=" + reviews + "]";
	}

//	public Collection<Review> findByReview(long parseLong) {
//
//		return reviews;
//	}
	
	
}
