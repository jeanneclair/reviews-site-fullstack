package org.wecancodeit.reviewssitefullstack;

import javax.persistence.Embeddable;


@Embeddable
public class Comment {
	
	private String text;

	public Comment(String text) {
		this.text = text;
	}
	
	public Comment() {
		
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Comment [text=" + text + "]";
	}

	
}
