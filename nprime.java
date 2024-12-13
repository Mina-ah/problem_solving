public class nprime {

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=2;
        int count = 0;
        int n=10;
        while(count<n){
            if(isPrime(num)){
                System.out.print(num+",");
                count++;
            }
            num++;
        }
    }
}
