$(document).ready(function(){
	setInterval(function(){
		$.ajax({
			url:'aging.do',
			type:'GET',
			dataType:'json',
			mimeType: 'text/plain; charset=ISO-8859-1',
			success:function(data){
				var html = '<small>';
				html += ''+new Date(data.begin);
				html += '<br/>';
				html += ''+new Date(data.end);
				html += '<br/><br/>';
				html += '<b>Years: </b>'+data.howManyYears+'&nbsp;';
				html += '<b>Months: </b>'+data.howManyMonths+'&nbsp;';
				html += '<b>Days: </b>'+data.howManyDays+'&nbsp;';
				html +='</small>';
				$('#aging').html(html);
			},
			error:function(xhr,status,error){
				$('#aging').html(xhr.responseText);
			}
		});
	}, 10000);
});