var BMIService = {

	getIndex: function(weight, height, callback) {
		$.ajax({
		  url: 'BMIController',
		  data: {'weight': weight, 'height': height},
		  success: function(result) {
		  	callback(result);
		  },
		  error: function() {
		  	callback(null);
		  }
		});
	},
	
	getDescription: function (index) {
		
		return "";
	}
	
};