jQuery.validator.addMethod("lettersonly", function(value, element) {
		  //return this.optional(element) || /^[a-z]+$/i.test(value);
		  return this.optional(element) || /^[A-Za-zÁÉÍÑÓÚáé íñó]*$/.test(value);
		 
		}, "Letters only please"); 