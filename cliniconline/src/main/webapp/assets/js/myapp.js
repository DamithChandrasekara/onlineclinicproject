$(function(){
	
	switch(menu){
	case 'Find Doctors':
		$('#doctors').addClass('active');
		break;
	case 'Medical Services':
		$('#meditest').addClass('active');
		break;
	case 'Ambulance':
		$('#ambulance').addClass('active');
		break;
	case 'Location':
		$('#location').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	}
})