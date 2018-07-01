package org.wecancodeit.reviewssitefullstack;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.annotation.Resource;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


public class ReviewControllerTest {
	
	ReviewController reviewController = new ReviewController();
	
	@Resource
	MockMvc mvc;

	@MockBean
	ReviewRepository reviews;
	
	@MockBean
	GenreRepository genres;

	@Mock
	Review review;
	
	@Mock
	Review genre;

	@Test
	public void getReviewsShouldReturnReviewsView() throws Exception {
		mvc.perform(get("/reviews")).andExpect(view().name(is(equalTo("reviews"))));
	}
	
	@Test
	public void getReviewsShouldBeSuccessful() throws Exception {
		mvc.perform(get("/reviews")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void findAllShouldReturnAllReviews() throws Exception {
		mvc.perform(get("/reviews")).andExpect(model().attribute("reviews", is(reviews.findAll())));
	}
	
	@Test
	public void getGenresShouldReturnGenresView() throws Exception {
		mvc.perform(get("/genres")).andExpect(view().name(is(equalTo("genres"))));
	}
	
	@Test
	public void getGenresShouldBeSuccessful() throws Exception {
		mvc.perform(get("/genres")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void findAllShouldReturnAllGenres() throws Exception {
		mvc.perform(get("/genres")).andExpect(model().attribute("genres", is(genres.findAll())));
	}

}
