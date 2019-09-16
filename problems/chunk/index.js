// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]


function chunk(arr, size) {
	const retArr = [];
	if(size >= arr.length){
		retArr.push(arr);
	}
	else{
		
		counter = 0;
		while(counter <= arr.length){
			subArr = [];	
			for(let i=counter; i< counter + size; i++){
				if(arr[i])	
				 subArr.push(arr[i])
			}
			counter += size	
			if(subArr.length > 0)
				retArr.push(subArr)		
		}
	}
	console.log(retArr);
	return retArr
}

module.exports = chunk;


// #Alternate solution 1
// function chunk(array, size) {
//   const chunked = [];

//   for (let element of array) {
//     const last = chunked[chunked.length - 1];

//     if (!last || last.length === size) {
//       chunked.push([element]);
//     } else {
//       last.push(element);
//     }
//   }

//   return chunked;


// Alternate Solution 2

// function chunk(array, size) {
//   const chunked = [];
//   let index = 0;

//   while (index < array.length) {
//     chunked.push(array.slice(index, index + size));
//     index += size;
//   }

//   return chunked;
// }