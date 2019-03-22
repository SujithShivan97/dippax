$(function() {

	// for adding a loader
	$(window).load(function() {
		setTimeout(function() {
			$(".se-pre-con").fadeOut("slow");
		}, 500);
	});

	// to tackle the csrf token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');

	if ((token != undefined && header != undefined)
			&& (token.length > 0 && header.length > 0)) {
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {
			xhr.setRequestHeader(header, token);
		});

	}

	// to solve active menu bar problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;

	case 'All Items':
		$('#listItems').addClass('active');
		break;

	case 'Manage Items':
		$('#manageItems').addClass('active');
		break;

	case 'User Cart':
		$('#userCart').addClass('active');
		break;

	default:
		if (menu == "Home")
			break;
		$('#listItems').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

	// code for jquery dataTable

   
    	
	var $table=$('#listProductTable');
	
	if($table.length)
		{
		 var jsonUrl=''
			    if(window.categoryId == '')
			    	{
			    	jsonUrl= window.contextRoot +'/json/data/all/products';
			    	}
			    else
			    	{
			    	jsonUrl=window.contextRoot+'/json/data/category/'+ window.categoryId +'/products';
			    	}
			    	
		
		//console.log('inside the table!');
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 records','5 records','10 records','ALL']],
			pageLength:5,
			ajax:{
				url:jsonUrl,
				dataSrc:''
				},
				columns:[
					{
						data:'name'
					},
					{
						data:'brand'
					},
					{
						data:'unitPrice'
					},
					{
						data:'quantity'
					},
					
				]
			
		});
		
		
		}
	
	
	
				
		});