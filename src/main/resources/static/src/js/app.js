const songs = [
	
	'Exit Music', 'Heart-Shaped Box', 'Island in the Sun', 'Today', 'I and Love and You', 
	'Lover of the Light', 'Just Can\u0027t Get Enough', 'Lovesong', 'Angels', 'Say Yes'

]

function newSong() {

let randomNumber = Math.floor(Math.random() * (songs.length));

document.getElementById('songDisplay').innerHTML = songs[randomNumber];

}

const tagList = document.querySelector('.tagList');

tagList.addEventListener('click', removeTag);

function removeTag(event) {

	if (event.target.classList.contains('delete')) {

		const reviewId = document.getElementById("reviewId").innerHTML;
		const deleteButton = event.target;
		const cityContainer = deleteButton.parentElement.parentElement;
		const hrefArray = cityContainer.querySelector('a').getAttribute('href').split("/");
		const tagId = hrefArray[2];
		const xhr = new XMLHttpRequest()
		xhr.onreadystatechange = function(response) {
			if(xhr.readyState == 4 && xhr.status == 200) {
				const remainingTags = JSON.parse(response.currentTarget.response);
				let list = ''
				remainingTags.forEach(function(tag) {

					list += `
					<li>
						<a href="/tags/{tagId}">
							${tag.name}
						</a>
						<button class="delete">Remove</button>
					</li>
				`
				})
				tagList.innerHTML = list

			}
		}
		xhr.open("DELETE", `/api/tags/${tagId}/${reviewId}`, true)
		xhr.send()

	}
}