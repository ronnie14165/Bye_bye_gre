package leetcode;

public class Solution_1108_defangIPaddr {
    public static String defangIPaddr(String address) {
        char[] array = new char[address.length()+6];
        int j = 0;
        for (int i = 0; i < address.length(); i++) {

            if (address.charAt(i) == '.') {
                array[j] = '[';
                array[j + 1] = address.charAt(i);
                array[j + 2] = ']';
                j += 3;

            } else {
                array[j] = address.charAt(i);
                j++;
            }
        }
        String result = String.valueOf(array);
        return result;
    }

    public static void main(String[] args) {
        String a = "111.1.1.1";
        System.out.println(defangIPaddr(a));
    }
}
