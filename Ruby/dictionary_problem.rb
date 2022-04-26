require 'rspec/autorun'

class Dictionary
	attr_accessor :input 
	
	def initialize(input)
		@nouns = ["abcd", "c", "def", "h", "ij", "cde"]
		@verbs = ["bc", "fg", "g", "hij", "bcd"]
		@articles = ["a", "ac", "e"]
		@input = input
	end	

	def call
		input_arr = @input.split("")
		return_arr = []
		nouns = []
		possible_words = word_combination
		possible_nouns = @nouns.include?(input) ? [input] : []
		possible_verbs = @verbs.include?(input) ? [input] : []
		possible_articles = @articles.include?(input) ? [input] : []
		possible_words.each do |word|
			possible_nouns << word if @nouns.include?(word)
			possible_verbs << word if @verbs.include?(word)
			possible_articles << word if @articles.include?(word)
		end	
		return_arr = [possible_nouns, possible_verbs, possible_articles].flatten
		return_arr
	end	

	private

	def word_combination
	    str_size = input.length
	    return_word = []
	    (1..str_size).each do |l|
	      (0..str_size - l).each do |i|
	      	## Ignoring the orginal input
	      	next if input[i,l] == input
	        return_word.push(input[i,l])
	        # Also capturing all reverse of substrings
	        return_word.push(input[i,l].reverse) if input[i, l].length > 1
	      end
	    end
	    return_word
	end	
end

describe Dictionary do
	it "finds possible nouns, verbs and articles in that order" do
		dictionary = Dictionary.new("abcd")
		expect(dictionary.call).to match_array(["abcd", "c", "bc", "bcd", "a"])
    end
end	