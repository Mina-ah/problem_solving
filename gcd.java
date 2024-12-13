import java.util.Scanner;

public class gcd {
    public static int finder(int a,int b){
        while(b!=0){
            int remainder=a%b;
            a=b;
            b=remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int ans=finder(a,b);
        System.out.println(ans);
    }
}
