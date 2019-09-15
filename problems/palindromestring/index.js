function palindrome(str){
	return str.split(' ').every((char, i) => str[i] == str[str.length - 1 -i])
}

module.exports = palindrome;