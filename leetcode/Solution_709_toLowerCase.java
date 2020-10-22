package leetcode;

public class Solution_709_toLowerCase {
    public static String toLowerCase(String str) {
        char[] char_array = new char[str.length()];
        int index = 'A' - 'a';
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if ('A' <= temp && temp <= 'Z') {
                char_array[i] = (char) (temp - index);
            }else
                char_array[i] = temp;
        }
        String result = new String(char_array);
        return result;
    }
}
