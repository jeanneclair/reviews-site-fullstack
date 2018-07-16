package org.wecancodeit.reviewssitefullstack;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	TagRepository tagRepo;
	
	@Autowired
	ReviewRepository reviewRepo;
	
	@RequestMapping("/tags")
	public Collection<Tag> getTags() {
		return (Collection<Tag>) tagRepo.findAll();
	}

	@RequestMapping(value = "/tags/{id}/{reviewId}", method = RequestMethod.DELETE)
	public Collection<Tag> deleteTag(@PathVariable(name = "id") Long id, @PathVariable(name = "reviewId") Long reviewId) {
		
		//Was working with Aaron on this part, but ran out of time. Was deleting before... but had issues
		//with it deleting all tags, and needing to refresh to show the undeleted tags. Will finish this later.
		reviewRepo.findOne(reviewId);
		tagRepo.delete(id);
//		return (Collection<Tag>) tagRepo.findAll();
		return tagRepo.findById(reviewId);
	
	}
}
