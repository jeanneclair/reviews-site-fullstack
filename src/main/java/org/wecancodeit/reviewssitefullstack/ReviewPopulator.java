package org.wecancodeit.reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewPopulator implements CommandLineRunner {
	
	@Resource
	private GenreRepository genreRepo;
	
	@Resource
	private ReviewRepository reviewRepo;
	
	public ReviewPopulator() {
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Genre genre1 = genreRepo.save(new Genre("Alt Rock"));
		Genre genre2 = genreRepo.save(new Genre("80's"));
		Genre genre3 = genreRepo.save(new Genre("90's"));
		Genre genre4 = genreRepo.save(new Genre("Indie Folk"));
		Genre genre5 = genreRepo.save(new Genre("Indie Rock"));
		
		Review review1 = reviewRepo.save(new Review("Exit Music", "Radiohead", "lyrics", "/src/images/1.png", genre1, 5));
		Review review2 = reviewRepo.save(new Review("Heart-Shaped Box", "Nirvana", "lyrics", "/src/images/2.jpg", genre1, 3));
		Review review3 = reviewRepo.save(new Review("Just Can't get Enough", "Depeche Mode", "lyrics", "/src/images/3.jpg", genre2, 3));
		Review review4 = reviewRepo.save(new Review("Lovesong", "The Cure", "lyrics", "/src/images/4.jpg", genre2, 4));
		Review review5 = reviewRepo.save(new Review("Island in the Sun", "Weezer", "lyrics", "/src/images/5.jpg", genre3, 4));
		Review review6 = reviewRepo.save(new Review("Today", "Smashing Pumpkins", "lyrics", "/src/images/6.jpg", genre3, 4));
		Review review7 = reviewRepo.save(new Review("I and Love and You", "The Avett Brothers", "lyrics", "/src/images/7.jpg", genre4, 5));
		Review review8 = reviewRepo.save(new Review("Lover of the Light", "Mumford & Sons", "lyrics", "/src/images/8.jpg", genre4, 4));
		Review review9 = reviewRepo.save(new Review("Angels", "The XX", "lyrics", "/src/images/9.jpg", genre5, 5));
		Review review10 = reviewRepo.save(new Review("Say Yes", "Elliott Smith", "lyrics", "/src/images/10.jpg", genre5, 4));
			
//		Review review1 = reviewRepo.save(new Review("Exit Music", "Radiohead", "lyrics", "/images/1.png", genre1, 5));
//		Review review2 = reviewRepo.save(new Review("Heart-Shaped Box", "Nirvana", "lyrics", "/images/2.jpg", genre1, 3));
//		Review review3 = reviewRepo.save(new Review("Just Can't get Enough", "Depeche Mode", "lyrics", "/images/3.jpg", genre2, 3));
//		Review review4 = reviewRepo.save(new Review("Lovesong", "The Cure", "lyrics", "/images/4.jpg", genre2, 4));
//		Review review5 = reviewRepo.save(new Review("Island in the Sun", "Weezer", "lyrics", "/images/5.jpg", genre3, 4));
//		Review review6 = reviewRepo.save(new Review("Today", "Smashing Pumpkins", "lyrics", "/images/6.jpg", genre3, 4));
//		Review review7 = reviewRepo.save(new Review("I and Love and You", "The Avett Brothers", "lyrics", "/images/7.jpg", genre4, 5));
//		Review review8 = reviewRepo.save(new Review("Lover of the Light", "Mumford & Sons", "lyrics", "/images/8.jpg", genre4, 4));
//		Review review9 = reviewRepo.save(new Review("Angels", "The XX", "lyrics", "/images/9.jpg", genre5, 5));
//		Review review10 = reviewRepo.save(new Review("Say Yes", "Elliott Smith", "lyrics", "/images/10.jpg", genre5, 4));

	}

}
