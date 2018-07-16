package org.wecancodeit.reviewssitefullstack;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByName(String tagText);

	Collection<Tag> findById(Long id);


}
