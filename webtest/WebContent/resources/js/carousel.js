$(document).ready(function(){
	$.ajax({
		url:'data/carouselData.json.0',
		type:'GET',
		dataType:'json',
		mimeType: 'text/plain; charset=ISO-8859-1',
		success:function(data){
			var count = '';
			var ul = '';
			var li = '';
			var width = 0;
			
			count += '<div class="red">'+data.countRed+'</div>'
						+'<div class="yellow">'+data.countYellow+'</div>'
						+'<div class="blue">'+data.countBlue+'</div>';
			
			$.each(data.listRiskTicket, function(index, value){
				width += 480; 
				
				var css = findBackgroundClass(value.riskGrade);
						
				li += '<li class="'+css+'"> <div class="ticketDetail">';
				li +=	'<div><strong>' + value.ticketNo + '</strong></div>';
				li +=	'<div> Posting Date : <small>' + value.postingDate + '</small></div>';
				li +=	'<div> Name : ' + value.consFirstName + '&nbsp;' + value.consLastName + '</div>';
				li +=	'<div> Status : <small>' + value.statusDesc + '</small></div>';
				li +=	'<div> Model : <small>' + value.model + '</small></div>';
				li +=	'<div> Serial : <small>' + value.serialNo + '</small></div>';
				
				$.each(value.lines, function(i, l){
					if(i==0)
						li += '<BR/><div> '+l.label+' '+l.value+'</div> <BR/>';
					else
						li += '<div>'+l.label+' <small>'+ parseFloat(l.value)+'</small></div>';
				});
				
				li += '</div></li>'; 
				$('#carousel ul li').css({'background-color':'red'});
			});
			
			ul = '<ul style="width: ' + width + 'px; height: 308px;" >';
			ul += li;
			ul += '</ul>';
			$('#carousel').html(ul);
			$('#countTotal').html(count);
		},
		error:function(data,status,error){	
			$('#carousel').html(status+' >< '+ error + ' >< '+ data.status );
			$('body').append(data.responseText);
		}
	});
});

function findBackgroundClass(color){
	var css = '';
	if(color == 'R')
		css = 'red';
	else if(color == 'O')
		css = 'yellow';
	else
		css = 'blue';
	return css;
}

var timer = null;
$(document).ready(function(){
	timer = start();
});	

$(document).ready(function(){
	$('#carousel').mouseenter(function(){	
		clearInterval(timer);
	});
	$('#carousel').mouseleave(function(){
		timer = start();
	});
});

function start(){
	return setInterval(function(){
        $("#carousel ul").animate({marginLeft:-480},1000,function(){
            $(this).find("li:last").after($(this).find("li:first"));
            $(this).css({marginLeft:0});
        });
    },5000);
}