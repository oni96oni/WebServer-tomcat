var id1 = document.getElementById("id1");
	    	id1.onfocus = function(e) {
	    		result.innerHTML = "영문자 대/소문자 특수문자, 숫자 포함 8 ~ 32자";
	    	}
	    	
function formCheck(frm) {
      if(frm.id.value.length==0) {
        setMessage('필수 입력 항목 입니다.', frm.id);
        return false;
      }
      if(frm.password.value.length==0) {
        setMessage('필수 입력 항목 입니다.', frm.pwd);
        return false;
      }
      if(frm.passwordchk.value.length==0) {
        setMessage('필수 입력 항목 입니다.', frm.pwdchk);
        return false;
      }
      return true;
}

/* 

window.onload = function() {
	initEventBinding();
}

function initEventBinding() {
	requeiredEventBinding();
}

function requiredEventBinding() {
	var requiredElements = document.qureySelectorAll("input[required]");
	for(let element of requiredElements) {
		element.addEventListener("blur", requiredHandler)
	}
}

function requiredHandler(e) {
	var element = e.target;
	console.log(element);
}

*/