package org.wecancodeit.reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

//@Service
public class ReviewPopulator implements CommandLineRunner {
	
	@Resource
	private GenreRepository genreRepo;
	
	@Resource
	private ReviewRepository reviewRepo;
	
	@Resource
	private TagRepository tagRepo;
	
	@Resource
	private CommentRepository commentRepo;
	
	public ReviewPopulator() {
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Genre genre1 = genreRepo.save(new Genre("Alt Rock"));
		Genre genre2 = genreRepo.save(new Genre("80's"));
		Genre genre3 = genreRepo.save(new Genre("90's"));
		Genre genre4 = genreRepo.save(new Genre("Indie Folk"));
		Genre genre5 = genreRepo.save(new Genre("Indie Rock"));
		
		Review review1 = reviewRepo.save(new Review("Exit Music", "Radiohead", "Wake\r\n" + 
				"From your sleep\r\n" + 
				"The drying of\r\n" + 
				"Your tears\r\n" + 
				"Today\r\n" + 
				"We escape\r\n" + 
				"We escape\r\n" + 
				"Pack\r\n" + 
				"And get dressed\r\n" + 
				"Before your father hears us\r\n" + 
				"Before\r\n" + 
				"All hell\r\n" + 
				"Breaks loose\r\n" + 
				"Breathe\r\n" + 
				"Keep breathing\r\n" + 
				"Don't loose\r\n" + 
				"Your nerve\r\n" + 
				"Breathe\r\n" + 
				"Keep breathing\r\n" + 
				"I can't do this\r\n" + 
				"Alone\r\n" + 
				"Sing\r\n" + 
				"Us a song\r\n" + 
				"A song to keep\r\n" + 
				"Us warm\r\n" + 
				"There's\r\n" + 
				"Such a chill\r\n" + 
				"Such a chill\r\n" + 
				"You can laugh\r\n" + 
				"A spineless laugh\r\n" + 
				"We hope your\r\n" + 
				"Rules and wisdom choke you\r\n" + 
				"Now\r\n" + 
				"We are one\r\n" + 
				"In everlasting peace\r\n" + 
				"We hope that you choke\r\n" + 
				"That you choke\r\n" + 
				"We hope that you choke\r\n" + 
				"That you choke\r\n" + 
				"We hope\r\n" + 
				"That you choke\r\n" + 
				"That you choke", "/src/images/1.png", genre1, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/kK6sjaaK8FY\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 5));
		Review review2 = reviewRepo.save(new Review("Fade Into You", "Mazzy Star", "I want to hold the hand inside you\r\n" + 
				"I want to take a breath that's true\r\n" + 
				"I look to you and I see nothing\r\n" + 
				"I look to you to see the truth\r\n" + 
				"You live your life\r\n" + 
				"You go in shadows\r\n" + 
				"You'll come apart and you'll go blind\r\n" + 
				"Some kind of night into your darkness\r\n" + 
				"Colors your eyes with what's not there\r\n" + 
				"\r\n" + 
				"Fade into you\r\n" + 
				"Strange you never knew\r\n" + 
				"Fade into you\r\n" + 
				"I think it's strange you never knew\r\n" + 
				"\r\n" + 
				"A stranger's light comes on slowly\r\n" + 
				"A stranger's heart without a home\r\n" + 
				"You put your hands into your head\r\n" + 
				"And then its smiles cover your heart\r\n" + 
				"\r\n" + 
				"Fade into you\r\n" + 
				"Strange you never knew\r\n" + 
				"Fade into you\r\n" + 
				"I think it's strange you never knew\r\n" + 
				"\r\n" + 
				"Fade into you\r\n" + 
				"Strange you never knew\r\n" + 
				"Fade into you\r\n" + 
				"I think it's strange you never knew\r\n" + 
				"I think it's strange you never knew", "/src/images/2.jpg", genre1, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ImKY6TZEyrI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 4));
		Review review3 = reviewRepo.save(new Review("Just Can't get Enough", "Depeche Mode", "When I'm with you baby\r\n" + 
				"I go out of my head\r\n" + 
				"And I just can't get enough\r\n" + 
				"And I just can't get enough\r\n" + 
				"All the things you do to me\r\n" + 
				"And everything you said\r\n" + 
				"I just can't get enough\r\n" + 
				"I just can't get enough\r\n" + 
				"We slip and slide as we fall in love\r\n" + 
				"And I just can't seem to get enough of\r\n" + 
				"We walk together\r\n" + 
				"We're walking down the street\r\n" + 
				"And I just can't get enough\r\n" + 
				"And I just can't get enough\r\n" + 
				"Every time I think of you\r\n" + 
				"I know we have to meet\r\n" + 
				"And I just can't get enough\r\n" + 
				"I just can't get enough\r\n" + 
				"It's getting hotter\r\n" + 
				"It's a burning love\r\n" + 
				"And I just can't seem to get enough of\r\n" + 
				"I just can't seem to get enough\r\n" + 
				"I just can't seem to get enough\r\n" + 
				"And when it rains\r\n" + 
				"You're shining down for me\r\n" + 
				"And I just can't get enough\r\n" + 
				"And I just can't get enough\r\n" + 
				"Just like a rainbow\r\n" + 
				"You know you set me free\r\n" + 
				"And I just can't get enough\r\n" + 
				"And I just can't get enough\r\n" + 
				"You're like an angel\r\n" + 
				"And you give me your love\r\n" + 
				"And I just can't seem to get enough of\r\n" + 
				"I just can't get enough", "/src/images/3.jpg", genre2, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/_6FBfAQ-NDE\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 3));
		Review review4 = reviewRepo.save(new Review("Lovesong", "The Cure", "Whenever I'm alone with you\r\n" + 
				"You make me feel like I am home again\r\n" + 
				"Whenever I'm alone with you\r\n" + 
				"You make me feel like I am whole again\r\n" + 
				"Whenever I'm alone with you\r\n" + 
				"You make me feel like I am young again\r\n" + 
				"Whenever I'm alone with you\r\n" + 
				"You make me feel like I am fun again\r\n" + 
				"However far away\r\n" + 
				"I will always love you\r\n" + 
				"However long I stay\r\n" + 
				"I will always love you\r\n" + 
				"Whatever words I say\r\n" + 
				"I will always love you\r\n" + 
				"I will always love you\r\n" + 
				"Whenever I'm alone with you\r\n" + 
				"You make me feel like I am free again\r\n" + 
				"Whenever I'm alone with you\r\n" + 
				"You make me feel like I am clean again\r\n" + 
				"However far away\r\n" + 
				"I will always love you\r\n" + 
				"However long I stay\r\n" + 
				"I will always love you\r\n" + 
				"Whatever words I say\r\n" + 
				"I will always love you\r\n" + 
				"I will always love you", "/src/images/4.jpg", genre2, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/hXCKLJGLENs\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 4));
		Review review5 = reviewRepo.save(new Review("Island in the Sun", "Weezer", "Hip hip\r\n" + 
				"Hip hip\r\n" + 
				"Hip hip\r\n" + 
				"Hip hip\r\n" + 
				"\r\n" + 
				"When you're on a holiday\r\n" + 
				"You can't find the words to say\r\n" + 
				"All the things that come to you\r\n" + 
				"And I wanna feel it too\r\n" + 
				"\r\n" + 
				"On an island in the sun\r\n" + 
				"We'll be playing and having fun\r\n" + 
				"And it makes me feel so fine\r\n" + 
				"I can't control my brain\r\n" + 
				"\r\n" + 
				"Hip hip\r\n" + 
				"Hip hip\r\n" + 
				"\r\n" + 
				"When you're on a golden sea\r\n" + 
				"You don't need no memory\r\n" + 
				"Just a place to call your own\r\n" + 
				"As we drift into the zone\r\n" + 
				"\r\n" + 
				"On an island in the sun\r\n" + 
				"We'll be playing and having fun\r\n" + 
				"And it makes me feel so fine\r\n" + 
				"I can't control my brain\r\n" + 
				"\r\n" + 
				"We'll run away together\r\n" + 
				"We'll spend some time forever\r\n" + 
				"We'll never feel bad anymore\r\n" + 
				"\r\n" + 
				"Hip hip\r\n" + 
				"Hip hip\r\n" + 
				"Hip hip\r\n" + 
				"\r\n" + 
				"On an island in the sun\r\n" + 
				"We'll be playing and having fun\r\n" + 
				"And it makes me feel so fine\r\n" + 
				"I can't control my brain\r\n" + 
				"\r\n" + 
				"We'll run away together\r\n" + 
				"We'll spend some time forever\r\n" + 
				"We'll never feel bad anymore\r\n" + 
				"\r\n" + 
				"Hip hip\r\n" + 
				"\r\n" + 
				"We'll never feel bad anymore\r\n" + 
				"No no\r\n" + 
				"We'll never feel bad anymore\r\n" + 
				"No no\r\n" + 
				"No no\r\n" + 
				"No no", "/src/images/5.jpg", genre3, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/erG5rgNYSdk\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 4));
		Review review6 = reviewRepo.save(new Review("Today", "Smashing Pumpkins", "Today is the greatest\r\n" + 
				"Day I've ever known\r\n" + 
				"Can't live for tomorrow,\r\n" + 
				"Tomorrow's much too long\r\n" + 
				"I'll burn my eyes out\r\n" + 
				"Before I get out \r\n" + 
				"\r\n" + 
				"I wanted more\r\n" + 
				"Than life could ever grant me\r\n" + 
				"Bored by the chore\r\n" + 
				"Of saving face\r\n" + 
				"\r\n" + 
				"Today is the greatest\r\n" + 
				"Day I've never known\r\n" + 
				"Can't wait for tomorrow\r\n" + 
				"I might not have that long\r\n" + 
				"I'll tear my heart out\r\n" + 
				"Before I get out\r\n" + 
				"\r\n" + 
				"Pink ribbon scars\r\n" + 
				"That never forget\r\n" + 
				"I tried so hard\r\n" + 
				"To cleanse these regrets\r\n" + 
				"My angel wings\r\n" + 
				"Were bruised and restrained\r\n" + 
				"My belly stings\r\n" + 
				"\r\n" + 
				"Today is\r\n" + 
				"Today is\r\n" + 
				"Today is\r\n" + 
				"The greatest day\r\n" + 
				"\r\n" + 
				"I want to turn you on\r\n" + 
				"I want to turn you on\r\n" + 
				"I want to turn you on\r\n" + 
				"I want to turn you\r\n" + 
				"\r\n" + 
				"Today is the greatest\r\n" + 
				"Today is the greatest day\r\n" + 
				"Today is the greatest day\r\n" + 
				"That I have ever really known", "/src/images/6.jpg", genre3, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/xmUZ6nCFNoU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 4));
		Review review7 = reviewRepo.save(new Review("I and Love and You", "The Avett Brothers", "Load the car and write the note.\r\n" + 
				"Grab your bag and grab your coat.\r\n" + 
				"Tell the ones that need to know.\r\n" + 
				"We are headed north.\r\n" + 
				"One foot in and one foot back.\r\n" + 
				"But it don't pay to live like that.\r\n" + 
				"So I cut the ties and I jumped the tracks.\r\n" + 
				"For never to return.\r\n" + 
				"Ah Brooklyn, Brooklyn take me in.\r\n" + 
				"Are you aware the shape I'm in?\r\n" + 
				"My hands they shake, my head it spins.\r\n" + 
				"Ah Brooklyn, Brooklyn take me in.\r\n" + 
				"When at first I learned to speak.\r\n" + 
				"I used all my words to fight.\r\n" + 
				"With him and her and you and me.\r\n" + 
				"Ah, but it's just a waste of time.\r\n" + 
				"Yeah it's such a waste of time.\r\n" + 
				"That woman she's got eyes that shine.\r\n" + 
				"Like a pair of stolen polished dimes.\r\n" + 
				"She asked to dance I said it's fine.\r\n" + 
				"I'll see you in the morning time.\r\n" + 
				"Ah Brooklyn, Brooklyn take me in.\r\n" + 
				"Are you aware the shape I'm in?\r\n" + 
				"My hands they shake, my head it spins.\r\n" + 
				"Ah Brooklyn, Brooklyn take me in.\r\n" + 
				"Three words that became hard to say.\r\n" + 
				"I and love and you.\r\n" + 
				"What you were then I am today.\r\n" + 
				"Look at the things I do.\r\n" + 
				"Ah Brooklyn, Brooklyn take me in.\r\n" + 
				"Are you aware the shape I'm in?\r\n" + 
				"My hands they shake, my head it spins.\r\n" + 
				"Ah Brooklyn, Brooklyn take me in.\r\n" + 
				"Dumbed down and numbed by time and age.\r\n" + 
				"Your dreams that catch the world the cage.\r\n" + 
				"The highway sets the traveler's stage.\r\n" + 
				"All exits look the same.\r\n" + 
				"Three words that became hard to say.\r\n" + 
				"I and love and you.\r\n" + 
				"I and love and you.\r\n" + 
				"I and love and you.", "/src/images/7.jpg", genre4, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/T0eSpAgqrWo\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 5));
		Review review8 = reviewRepo.save(new Review("Lover of the Light", "Mumford & Sons", "In the middle of the night, I may watch you go\r\n" + 
				"There'll be no value in the strength of walls that I have grown\r\n" + 
				"There'll be no comfort in the shade of the shadows thrown\r\n" + 
				"But I'd be yours if you'd be mine\r\n" + 
				"Stretch out my life and pick the seams out\r\n" + 
				"Take what you like, but close my ears and eyes\r\n" + 
				"Watch me stumble over and over\r\n" + 
				"I have done wrong, you build your tower\r\n" + 
				"But call me home and I will build a throne\r\n" + 
				"And wash my eyes out never again\r\n" + 
				"But love the one you hold\r\n" + 
				"And I'll be your goal\r\n" + 
				"To have and to hold\r\n" + 
				"A lover of the light\r\n" + 
				"Skin too tight and eyes like marbles\r\n" + 
				"You spin me high, so watch me as I glide\r\n" + 
				"Before I tumble homeward, homeward\r\n" + 
				"I know I tried, I was not stable\r\n" + 
				"Flawed by pride, I miss my sanguine eyes\r\n" + 
				"So hold my hands up, breathe in and breathe out\r\n" + 
				"So love the one you hold\r\n" + 
				"And I'll be your goal\r\n" + 
				"To have and to hold\r\n" + 
				"A lover of the light\r\n" + 
				"And in the middle of the night, I may watch you go\r\n" + 
				"There'll be no value in the strength of walls that I have grown\r\n" + 
				"There'll be no comfort in the shade of the shadows thrown\r\n" + 
				"You may not trust the promises of the change I'll show\r\n" + 
				"But I'd be yours if you'd be mine\r\n" + 
				"So love the one you hold\r\n" + 
				"And I will be your goal\r\n" + 
				"To have and to hold\r\n" + 
				"A lover of the light\r\n" + 
				"So love the one you hold\r\n" + 
				"And I will be your goal\r\n" + 
				"To have and to hold\r\n" + 
				"A lover of the light", "/src/images/8.jpg", genre4, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/nMJUbZrNnA8\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 4));
		Review review9 = reviewRepo.save(new Review("Angels", "The XX", "Light reflects from your shadow\r\n" + 
				"It is more than I thought could exist\r\n" + 
				"You move through the room\r\n" + 
				"Like breathing was easy\r\n" + 
				"If someone believed me\r\n" + 
				"They would be\r\n" + 
				"As in love with you as I am\r\n" + 
				"They would be\r\n" + 
				"As in love with you as I am\r\n" + 
				"They would be\r\n" + 
				"As in love with you as I am\r\n" + 
				"They would be\r\n" + 
				"In love, love, love\r\n" + 
				"And everyday\r\n" + 
				"I am learning about you\r\n" + 
				"The things that no one else sees\r\n" + 
				"And the end comes too soon\r\n" + 
				"Like dreaming of angels\r\n" + 
				"And leaving without them\r\n" + 
				"And leaving without them\r\n" + 
				"Being\r\n" + 
				"As in love with you as I am\r\n" + 
				"Being\r\n" + 
				"As in love with you as I am\r\n" + 
				"Being\r\n" + 
				"As in love with you as I am\r\n" + 
				"Being\r\n" + 
				"As in love, love, love\r\n" + 
				"Love, love, love\r\n" + 
				"Love, love, love\r\n" + 
				"And with words unspoken\r\n" + 
				"A silent devotion\r\n" + 
				"I know you know what I mean\r\n" + 
				"And the end is unknown\r\n" + 
				"But I think I'm ready\r\n" + 
				"As long as you're with me\r\n" + 
				"Being\r\n" + 
				"As in love with you as I am\r\n" + 
				"Being\r\n" + 
				"As in love with you as I am\r\n" + 
				"Being\r\n" + 
				"As in love with you as I am\r\n" + 
				"Being\r\n" + 
				"As in love, love, love", "/src/images/9.jpg", genre5, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/_nW5AF0m9Zw\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 5));
		Review review10 = reviewRepo.save(new Review("Say Yes", "Elliott Smith", "I'm in love with the world through the eyes of a girl\r\n" + 
				"Who's still around the morning after\r\n" + 
				"We broke up a month ago and I grew up I didn't know\r\n" + 
				"I'd be around the morning after\r\n" + 
				"It's always been wait and see\r\n" + 
				"A happy day and then you pay\r\n" + 
				"And feel like shit the morning after\r\n" + 
				"But now I feel changed around and instead falling down\r\n" + 
				"I'm standing up the morning after\r\n" + 
				"Situations get fucked up and turned around sooner or later\r\n" + 
				"And I could be another fool or an exception to the rule\r\n" + 
				"You tell me the morning after\r\n" + 
				"Crooked spin can't come to rest\r\n" + 
				"I'm damaged bad at best\r\n" + 
				"She'll decide what she wants\r\n" + 
				"I'll probably be the last to know\r\n" + 
				"No one says until it shows, see how it is\r\n" + 
				"They want you or they don't\r\n" + 
				"Say yes\r\n" + 
				"I'm in love with the world through the eyes of a girl\r\n" + 
				"Who's still around the morning after", "/src/images/10.jpg", genre5, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/8bxmk09lCzk\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>", 4));

		Tag british = tagRepo.save(new Tag("british", review1, review3, review4, review8, review9));
		Tag american = tagRepo.save(new Tag("american", review2, review5, review6, review7, review10));
		Tag male = tagRepo.save(new Tag("male", review1, review3, review4, review5, review6, review7, review8, review9, review10));
		Tag female = tagRepo.save(new Tag("female", review2, review9));
	}
	

}
