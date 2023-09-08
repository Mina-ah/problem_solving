public class rstring6 {
    public static void permutation(char[] str, int idx) {
        if (idx == str.length - 1) {
            System.err.println(str);
            return;
        }
        for (int i = idx; i < str.length; i++) {
            swap(str, i, idx);
            permutation(str, idx+1);
            swap(str, i, idx);
        }

    }

    public static void swap(char[] str, int i, int idx) {
        char temp = str[i];
        str[i] = str[idx];
        str[idx] = temp;
    }

    public static void main(String[] args) {
        char[] str={'a','b','c'};
permutation(str, 0);
    }
}
