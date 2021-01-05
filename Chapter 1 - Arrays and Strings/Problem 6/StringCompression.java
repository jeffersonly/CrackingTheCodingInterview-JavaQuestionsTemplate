// CTCI Page 91

// Implement a method to perform basic string compression using
// the counts of repeated characters.
// For example, the string aabcccccaaa would become a2b1c5a3.
// If the "compressed" string would not become smaller than the original string,
// your method should return the original string.
// You can assume the string has only uppercase and lowercase letters (a - z).

// Hints: #92, #110
public class StringCompression {
    public static String compressString(String s) {
        StringBuilder result = new StringBuilder();
        String tracker = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i+1);
            if(substring.equals(tracker)) {
                count += 1;
            } else {
                if(count > 0) {
                    result.append(tracker);
                    result.append(count);
                }
                tracker = substring;
                count = 1;
            }
        }
        if(count > 0) {
            result.append(tracker);
            result.append(count);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String test = compressString("aabcccccaaa");
        System.out.println(test);
    }
}