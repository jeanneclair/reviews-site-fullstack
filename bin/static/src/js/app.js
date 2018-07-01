var songs = [
	
	'Exit Music', 'Heart-Shaped Box', 'Island in the Sun', 'Today', 'I and Love and You', 
	'Lover of the Light', 'Just Can\u0027t Get Enough', 'Lovesong', 'Angels', 'Say Yes'

]

function newSong() {

var randomNumber = Math.floor(Math.random() * (songs.length));

document.getElementById('songDisplay').innerHTML = songs[randomNumber];

}
