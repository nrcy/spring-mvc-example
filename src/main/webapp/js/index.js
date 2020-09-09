/**
 * index.html的js文件
 */
$("#d2m3-btn").click(function(){
	var jsonData = {
		"str01":$("#d2m3-str01").val(),
		"str02":$("#d2m3-str02").val()
	}
	$.ajax({
		type: "post",
		url: "d2m3",
		data: JSON.stringify(jsonData),
		contentType: "application/json;charset=UTF-8",
		dataType: "json",
		success: function(data){
			alert(JSON.stringify(data));
		}
	});
});

$("#d3m2-btn").click(function(){
	window.location.href = "d3m2/" + $("#d3m2-text").val();
});

$("#d7m2-btn").click(function(){
	$.post("d7m2",
	{
		"str01": $("#d7m2-text01").val(),
		"str02":$("#d7m2-text02").val()
	},function(data){
		if(data["result"]){
			alert("数据已提交");
		}
	});
});
 