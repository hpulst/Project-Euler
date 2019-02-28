
function sumOfMultiple(limit){
	var sum = 0; 
	for(i = 1; i < limit; i++){
		if(i % 3 == 0 || i % 5 == 0){
			sum += i;
		}
	}
	return sum;
}

console.log("Answer: " + sumOfMultiple(10));
