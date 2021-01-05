// CTCI Page 91

// Given a string, write a function to check if it is a permutation of a
// palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangement of letters.
// The palindrome does not need to be limited to just dictionary words.

// Example:
// Input: Tact Coa
// Output: True (permutations: 'taco cat', 'atco cta', etc.)

// Hints: #106, #121, #134, #136

public class PalindromePermutation {
    public static boolean checkPalindromePermutation(String s) {
        s = s.replace(" ", "").toLowerCase();
        for(int i = 0; i < s.length()/2; i++) {
            String s1 = s.substring(i, i+1);
            String s2 = s.substring(s.length()-1-i, s.length()-i);
            if(!s1.equals(s2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arg) {
        boolean result = checkPalindromePermutation("Taco cat");
        System.out.println(result);
    }
}