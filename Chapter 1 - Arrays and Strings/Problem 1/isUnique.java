//CTCI Page 90

//Implement an algorithm to determine if a string has all unique characters. 
//What if you cannot use additional data structures?

//Hints: #44, #117, #132

// Four Approaches to Solve this Problem
// Approach 1: Brute Force Technique O(N^2)
// Approach 2: Sorting O(N log N)
// Approach 3: Using Extra Data Structure O(N)
import java.util.*;

public class isUnique {

    // Approach 1
    public static boolean isUnique1(String s) {
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(s.substring(i, i+1).equals(s.substring(j, j+1))) {
                    return false;
                }
            }
        } 
        return true;
    }

    // Approach 2
    public static boolean isUnique2(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr); //built in sorting method (n log n)
        for(int i = 0; i < charArr.length-1; i++) {
            if(charArr[i] == charArr[i+1]) {
                return false;
            }
        }
        return true;
    }

    // Approach 3
    public static boolean isUnique3(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.substring(i, i+1))) {
                return false;
            } else {
                hm.put(s.substring(i, i+1), 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean status = isUnique3("tes");
        System.out.println(status);
    }
}