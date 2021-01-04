// CTCI Page 90

// Write a method to replace all spaces in a string with '%20:
// You may assume that the string has sufficient space at the end to hold the
// additional characters,
// and that you are given the "true" length of the string.
// (Note: If implementing in Java, please use a character array so that you can
// perform this operation in place.)

// EXAMPLE:
// Input: "Mr John Smith    ", 13
// Output: "Mr%20John%20Smith"

// Hints: #53, #118
import java.util.*;

public class URLify {
    public static char[] urlify(String s, int length) {
        char[] result = s.toCharArray();
        int blankIndex = result.length-1;
        for(int i = length-1; i >= 0; i--) {
            if(blankIndex <= 1) {
                break;    
            }
            if(result[i] != ' ') {
                result[blankIndex] = result[i];
                result[i] = ' ';
                blankIndex--;
            } else {
                result[blankIndex] = '0';
                result[blankIndex-1] = '2';
                result[blankIndex-2] = '%';
                blankIndex -= 3;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] test = urlify("Mr John Smith    ", 13);
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < test.length; i++) {
            str.append(test[i]);
        }
        System.out.println(str);
    }
}