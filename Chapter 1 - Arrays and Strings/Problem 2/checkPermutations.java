// CTCI Page 90

// Given two strings, write a method to decide if one is a permutation of the
// other.

// Hints: #1, #84, #122, #131
import java.util.*;

// Approach 1: Using HashMap O(N)
// Approach 2: Sorting Strings O(N log N)
public class checkPermutations {

    // Approach 1
    public static boolean checkPermutation1(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            if(hm.containsKey(s1.substring(i, i+1))) {
                int value = hm.get(s1.substring(i, i+1));
                hm.put(s1.substring(i, i+1), value+1);
            } else {
                hm.put(s1.substring(i, i+1), 1);
            }
        }

        for(int i = 0; i < s2.length(); i++) {
            if(hm.containsKey(s2.substring(i, i+1))) {
                int value = hm.get(s2.substring(i, i+1));
                if(value == 1) {
                    hm.remove(s2.substring(i, i+1));
                } else {
                    hm.put(s2.substring(i, i+1), value-1);
                }
            } else {
                return false;
            }
        }

        return true;
    }

    // Approach 2
    public static boolean checkPermutation2(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        for(int i = 0; i < charArr1.length; i++) {
            if(charArr1[i] != charArr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean result = checkPermutation2("asdasd", "adsdsa");
        System.out.println(result);
    }

}