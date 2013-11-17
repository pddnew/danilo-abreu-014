$(document).ready(function(){
	syncUserData();
});

$(document).ready(function(){
	setInterval(syncUserData, 5*1000);
});

function syncUserData(){
	$.ajax({
		url:'person.do',
		type:'GET',
		dataType:'json',
		mimeType: 'application/json',
		success:function(data){
			$('#userName').html(data.name);
			$('#userAge').html(data.age);
			var phones = data.phones;
			var html = '';
			$('.phone').hide();
			$.each(phones, function(index, value){
				html = value.number + '&nbsp;';
				if(value.type == 'cellphone'){
					$('#cell').html(html);
					$('#cell').show();
					$('#lblCell').show();
				}else if(value.type == 'home'){
					$('#home').html(html);
					$('#home').show();
					$('#lblHome').show();
				}else if(value.type == 'office'){
					$('#office').html(html);
					$('#office').show();
					$('#lblOffice').show();
				}
			});
		},
		error:function(data,status,error){
			var options = {};
			$('#errorMsg').fadeIn('slow', function(){
				$("#errorMsg").show( 'slide', options, 1500, function(){
					$('#errorMsg').fadeOut(10000, function(){});
				});
			});
		}
	});	
}
function callback() {
    setTimeout(function() {
      $( "#userData:visible" ).removeAttr( "style" ).fadeOut();
    }, 1000 );
 }
