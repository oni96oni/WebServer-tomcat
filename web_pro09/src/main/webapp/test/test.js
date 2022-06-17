var id1 = document.getElementById("id1");
	    	id1.onfocus = function(e) {
	    		result.innerHTML = "영문자 대/소문자 특수문자, 숫자 포함 8 ~ 32자";
	    	}
	    	
function formCheck(frm) {
      let msg ='';
      if(frm.id.value.length==0) {
        setMessage('필수 입력 항목 입니다.', frm.id);
        return false;
      }
      if(frm.pwd.value.length==0) {
        setMessage('필수 입력 항목 입니다.', frm.pwd);
        return false;
      }
      if(frm.pwdchk.value.length==0) {
        setMessage('필수 입력 항목 입니다.', frm.pwdchk);
        return false;
      }
      return true;
}