$(function(){
	//active the menu problem
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
		break;
	}
	
	//code query for data Table
	var products =[
		
		['1','ABC','100.00', '2','Yes'],
		['2','DEF'],
		['3','GHI'],
		['4','JKL'],
		['5','LMN'],
		['6','OPW'],
		['7','SDF'],
		['8','HJK']		
	];
	var $table = $('#productListTable');
	// execute the below code only where we have this table
	if ($table.length) {
		//console.log('Inside the table!');
		$table.DataTable( {
			data: products
		});
	}
});