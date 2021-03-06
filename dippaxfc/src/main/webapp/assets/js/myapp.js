$(function() {

	
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


   
   var $table=$('#productListTable');
    if($table.length)
    	{ 
    	var jsonUrl='';
    	if(window.categoryId=='')
        {
    		jsonUrl=window.contextRoot + '/json/data/all/products';

         }
    	else
    		{
    		jsonUrl=window.contextRoot + '/json/data/category/'+ window.categoryId + 'products';
    		
    		}
    	$table.DataTable( {
    		lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
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
    					data:'unitPrice',
    					mRender:function(data,type,row)
    					{
    						return '&#8377; ' + data
    					}
    				},
    				{
    					data:'quantity',
    					mRender(data,type,row)
    					{
    						if(data < 1)
    							{
    							return '<span style="color:red">OUT OF STOCK</span>';
    							}
    						  return data;
    						}
    				      
                     },
    				
                     {
    					data:'id',
    					bSortable:false,
    					mRender:function(data,type,row)
    					{
    						var str='';
    						str += '<a href="'+ window.contextRoot +'/show/'+ data +'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a>  &#160;';
    						if(row.quantity < 1)
    							{
    							str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></a>';
    							}
    						else
    							{
    							str += '<a href="'+ window.contextRoot +'/cart/add/'+ data +'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></a>';
    							}
    						
    						
    						return str;
    					}
    				}
    				
    			]
    		
    		
    		
    	});
    	
    	
    	
    	}
   
   

  });
