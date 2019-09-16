// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

function anagrams(string1, string2){
	let str1 = string1.replace(/ /g, '').toLowerCase();
	let str2 = string2.replace(/ /g, '').toLowerCase();


	let charMapStr1 = {};
	let charMapStr2 = {};
	charMapStr1 = charMap(str1);
	charMapStr2 = charMap(str2);

  if (Object.keys(charMapStr1).length !== Object.keys(charMapStr2).length) {
    return false;
  }

  for (let char in charMapStr1) {
    if (charMapStr1[char] !== charMapStr2[char]) {
      return false;
    }
  }

	return true

}

function charMap(str){
	const mapChar = {}
	for(let ch of str){
		mapChar[ch] = mapChar[ch] + 1 || 1;
	}
	return mapChar
}

module.exports = anagrams;


// Alternative Solution:

// function anagrams(stringA, stringB) {
//   return cleanString(stringA) === cleanString(stringB);
// }

// function cleanString(str) {
//   return str
//     .replace(/[^\w]/g, '')
//     .toLowerCase()
//     .split('')
//     .sort()
//     .join('');
// }