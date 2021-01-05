// CTCI Page 91

// There are three types of edits that can be performed on strings:
// insert a character, remove a character, or replace a character.
// Given two strings, write a function to check if they are one edit (or zero
// edits) away.

// Example:
// pale, ple -> true
// pales, pale -> true
// pale, bale -> true
// pale, bake -> false

// Hints: #23, #97, #130
public class OneAway {
    public static boolean oneAway(String s1, String s2) {
        if(s1.length() > (s2.length()+1)) {
            return false;
        }
        
        int edits = 0;
        int pointer = 0;
        
        if(s1.length() == s2.length()) {
            for(int i = 0; i < s1.length(); i++) {
                if(!s1.substring(i, i+1).equals(s2.substring(i, i+1))) {
                    edits += 1;
                }
            }
        } else if(s1.length() > s2.length()) {
            for(int i = 0; i < s1.length(); i++) {
                String charS1 = s1.substring(i, i+1);
                String charS2 = s2.substring(pointer, pointer+1);
                
                if((pointer >= (s2.length() - 1)) && (edits < 1)) {
                    return true;
                }

                if(charS1.equals(charS2)) {
                    pointer += 1;
                } else {
                    edits += 1;
                }
            }
        } else {
            for(int i = 0; i < s2.length(); i++) {
                String charS1 = s1.substring(pointer, pointer+1);
                String charS2 = s2.substring(i, i+1);
                
                if((pointer >= (s1.length() - 1)) && (edits < 1)) {
                    return true;
                }

                if(charS1.equals(charS2)) {
                    pointer += 1;
                } else {
                    edits += 1;
                }
            }
        }

        if(edits > 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean check = oneAway("pale", "bake");
        System.out.println(check);
    }
}