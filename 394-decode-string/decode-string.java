class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();

        char[] ss = s.toCharArray();

        StringBuilder temp = new StringBuilder();
        int count = 0;

        for (int i = 0; i < ss.length; i++) {

            if ((ss[i] >= 'a' && ss[i] <= 'z') || 
                (ss[i] >= 'A' && ss[i] <= 'Z')) {

                temp.append(ss[i]);
            }

            else if (ss[i] >= '0' && ss[i] <= '9') {
                count = (count * 10) + (ss[i] - '0');
            }

            else if (ss[i] == '[') {
                str.push(temp.toString());
                temp.setLength(0);

                num.push(count);
                count = 0;
            }

            else if (ss[i] == ']') {
                int x = num.pop();
                String sss = temp.toString();

                String prev = str.isEmpty() ? "" : str.pop();

                String neww = prev + sss.repeat(x);

                temp = new StringBuilder(neww);
            }
        }

        return temp.toString();
    }
}