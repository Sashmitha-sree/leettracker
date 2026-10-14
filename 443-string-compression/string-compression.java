
class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int write = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[write++] = current;

            if (count > 1) {
                String num = String.valueOf(count);

                for (int j = 0; j < num.length(); j++) {
                    chars[write++] = num.charAt(j);
                }
            }
        }

        return write;
    }
}
