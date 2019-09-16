// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str){
	const charMap = {}
	let max = 0
	let retVal = ''

	for(let ch of str){
		charMap[ch] = charMap[ch] + 1 || 1
	}

	for(let obj in charMap){
		if(charMap[obj] > max){
			max = charMap[obj]
			retVal = obj
		}
	}

	return retVal
}

module.exports = maxChar;