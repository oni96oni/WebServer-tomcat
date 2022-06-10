/**
 * 
 */
function addUrlList() {
	var num = document.getElementById("id_num")
	var url = document.getElementById("id_url");
	var name = document.getElementById("id_name");
	var idx = parseInt(num.value);
	
	if(!url.value) {
		url.focus();
		return;		
	} else if (!name.value) {
		name.focus();
		return;		
	}
	
	var li_tags = document.getElementsByTagName("li");
	console.log(li_tags)
	if(!idx || idx > li_tags.length || idx <= 0) {
		idx = li_tags.length - 1;
	} else {
		idx = idx - 2;
		if(idx < 0) {
			idx = 0;
		}
	}
	
	var li = document.createElement("li");
	var a = document.createElement("a");
	
	a.setAttribute("href", url.value);
	a.innerText = name.value;
	
	li.appendChild(a);
	
	if(idx < 0) {
		li_tags[0].before(li);
	} else {
		li_tags[idx].after(li);
	}
	
	num.value="";
	url.value="";
	name.value="";
	num.focus();
}