package org.wecancodeit.reviewssitefullstack;

import javax.annotation.Resource;

import org.junit.Test;

public class ReviewPopulatorTest {
	
	ReviewPopulator reviewPopulator = new ReviewPopulator();
		
	@Resource
	private GenreRepository genreRepo;
	
	@Resource
	private ReviewRepository reviewRepo;
	
	@Test //?
	Genre testGenre = genreRepo.save(new Genre("rock"));
	Review testReview = reviewRepo.save(new Review("songName", "bandName", "songLyrics", "imageUrl", testGenre, 5));
	
	assertThat(reviewRepo)
	
	

}
