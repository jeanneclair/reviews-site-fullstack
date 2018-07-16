package org.wecancodeit.reviewssitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	private String text;
	
	@ManyToOne
	private Review review;

	public Comment(String text, Review review) {
		this.text = text;
		this.review = review;
	}
	
	public Comment() {
		
	}

	public Long getId() {
		return id;
	}
	
	public String getText() {
		return text;
	}

	public Review getReview() {
		return review;
	}

	@Override
	public String toString() {
		return "Comment [text=" + text + "]";
	}

	
}
