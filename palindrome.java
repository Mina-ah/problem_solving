import java.util.Scanner;

public class palindrome {
    public static int palin(int n){
        int remainder=0;
        while(n!=0){
            int digit=n%10;
            remainder=remainder*10+digit;
            n=n/10;
        }
        return remainder;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int rev=palin(n);
        if(n==rev)
        System.out.println(rev+" Number is palindrome");
        else
        System.out.println("Number is not palindrome");
    }
}
