public class arm {
    public static void main(String[] args) {
        int num=153;
        int onum=num;
        int digit=0;
        while(num > 0){
            num=num/10;
            digit++;
        }
        num=onum;
        int sum=0;
        while(num > 0){
            int val=num%10;
            sum=sum+(int)Math.pow(val, digit);
            num=num/10;
        }
        if(sum==onum)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");
    }
}
