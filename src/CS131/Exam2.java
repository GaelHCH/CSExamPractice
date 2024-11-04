package CS131;

public class Exam2 {
    public static void main(String[] args) {
        String[] s = {"helofwefef", "helo", "helahgaisehgo", "helfsdfo"};
        int[] test;
        test = new int[]{24,42,4};
        int total;

        System.out.println("Expected: " + longestStr(s));
        System.out.println("Actual: " + longestStr2(s));
    }

    public static String longestStr(String[] s) {
        int len =0;
        int index=0;
        for (int i =0; i<s.length; i++)
        {
            if (s[i].length()> len) {
                len=s[i].length();
                index = i;
            }
        }
        return s[index];
    }

    public static String longestStr2(String[] s) {
        int maxLength = 0; int maxIndex = 0;

        for (int a = 0; a < s.length; a++) {
            if (s[a].length() > maxLength) {
                maxLength = s[a].length();
                maxIndex = a;
            }
        }
        return s[maxIndex];
    }
}
