public class URLify {
    public static void urlify(char[] s, int trueLength) {
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) if (s[i] == ' ') spaces++;
        int i = trueLength - 1, j = trueLength + spaces * 2 - 1;
        while (i >= 0) {
            if (s[i] == ' ') {
                s[j--] = '0';
                s[j--] = '2';
                s[j--] = '%';
            } else {
                s[j--] = s[i];
            }
            i--;
        }
    }

    public static void main(String[] args) {
        char[] a = "Mr John Smith    ".toCharArray();
        urlify(a, 13);
        System.out.println(new String(a));
    }
}
