//I couldn't figure out how to integrate the jasmine files into my project.

//Couldn't find an example test, but attempting the planning part of the test based on the slides.


describe('newSong', function() {
	it('returns a song when given array and random nummber as paramaters', function() {
		expect(newSong().size()).toEqual(10)
	});
});