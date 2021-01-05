// CTCI Page 91

// Assume you have a method isSubstring which checks if
// one word is a substring of another.
// Given two strings, S1 and S2,
// write code to check if S2 is a rotation of S1
// using only one call to isSubstring
// (e.g.,"waterbottle" is a rotation of"erbottlewat").

// Hints: #34, #88, #104
public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        StringBuilder track = new StringBuilder();
        int pointer = 0;
        for(int i = 0; i < s1.length(); i++) {
            String charS1 = s1.substring(i, i+1);
            String charS2 = s2.substring(pointer, pointer+1);
            if(charS1.equals(charS2)) {
                pointer++;
            } else {
                track.append(charS1);
            }
        }

        String trackToStr = track.toString();
        for(int i = 0; i < trackToStr.length(); i++) {
            String charS1 = trackToStr.substring(i, i+1);
            String charS2 = s2.substring(pointer, pointer+1);

            if(charS1.equals(charS2)) {
                pointer++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean test = isRotation("waterbottle", "erbottlewat");
        System.out.println(test);
    }
}