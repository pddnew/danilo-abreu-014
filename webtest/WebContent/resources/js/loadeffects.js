$(document).ready(function(){
	var width = $(document).width();
	var height = $(document).height();
	$('#loader').css({
			'position':'absolute',
			'width':'32px', 'height':'32px',
			'margin-top':$(window).height()/2,
			'margin-left':$(window).width()/2, 
			'background-image':'url("resources/img/ajax-loading.gif")'
		});
	$('#mask').css({
			'position':'absolute',
			'width':'32px', 'height':'32px',
			'margin-top':$(window).height()/2,
			'margin-left':$(window).width()/2 
		});
	$('#mask').animate({
		   'width':width,
		   'height':height,
		   'opacity':0.7,
		   'background-color':'#444',
		   'margin-left':'-8px',
		   'margin-top':'-10px'
		}, 1000, function(){
			setTimeout(function(){
				$('#mask').fadeOut(5000);
				$('#loader').fadeOut(5000);
			},10000);
		});
});

$(window).resize(function(){
	$('#mask').css({
		   'width':$(document).width(),
		   'height':$(document).height()
	});
	$('#loader').css({
		'margin-top':$(window).height()/2,
		'margin-left':$(window).width()/2
	});
});
