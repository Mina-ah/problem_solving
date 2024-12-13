import java.util.Scanner;

public class prime {

     public static void main(String[] args) {
        int n,flag=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
               flag=1;
               break;
            }
        }
        if(flag==0){
        System.out.println("number is prime");
        }
        else{
        System.err.println("not prime");
     }
    }
}