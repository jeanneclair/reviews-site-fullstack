package org.wecancodeit.reviewssitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Autowired
	GenreRepository genreRepo;

	@Autowired
	ReviewRepository reviewRepo;

	@Autowired
	TagRepository tagRepo;

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

	@RequestMapping("/tags")
	public String getTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";

	}

	@RequestMapping("/tags/{id}")
	public String getTag(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";

	}

	@RequestMapping(value = "/tags", method = RequestMethod.POST)
	public String addTag(String tagText, @RequestParam(name = "reviewId") String reviewId) {

		if (tagRepo.findByName(tagText) == null) {

			Review formReviewId = reviewRepo.findOne(Long.parseLong(reviewId));
			tagRepo.save(new Tag(tagText, formReviewId));
			return "redirect:/reviews/" + reviewId;

		} else {

			return "redirect:/reviews/" + reviewId;
		}

	}

	@RequestMapping(value = "/reviews/{id}", method = RequestMethod.POST)
	public String addComment(@PathVariable(name = "id") String commentText) {

		return "redirect:/reviews/{id}";
	}

}
