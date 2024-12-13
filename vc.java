import java.util.Arrays;

public class vc {
    public static void main(String[] args) {
        String str="silent";
        String str1="listen";
        char[] a=str.toCharArray();
        char[] b=str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b))
        System.out.println("anagram");
        else
        System.out.println("not anagram");
    }
}
