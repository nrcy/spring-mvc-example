/**
 * index.html的js文件
 */

window.onload = function(){
	var d3m2_btn = document.getElementById("d3m2-btn");
	d3m2_btn.onclick = function(){
		var d3m2_text = document.getElementById("d3m2-text");
		window.location.href = "d3m2/" + d3m2_text.value;
	}
}
