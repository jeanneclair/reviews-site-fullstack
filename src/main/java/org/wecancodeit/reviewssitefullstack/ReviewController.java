package org.wecancodeit.reviewssitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	
	@Autowired
	GenreRepository genreRepo;
	
	@Autowired
	ReviewRepository reviewRepo;
	
	@RequestMapping("/genres")
	public String getGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}
	
	@RequestMapping("/genres/{id}")
	public String getGenre(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("genre", genreRepo.findOne(id));
		return "genre";
		
	}
	
	@RequestMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}
	
	@RequestMapping("/reviews/{id}")
	public String getReview(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
		
	}

}
