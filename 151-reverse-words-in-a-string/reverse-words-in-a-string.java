
import java.util.*;

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!str.isEmpty()) {
                    list.add(str);
                    str = "";
                }
            } else {
                str += s.charAt(i);
            }
        }

        if (!str.isEmpty()) {
            list.add(str);
        }

        Collections.reverse(list);

        return String.join(" ", list);
    }
}
