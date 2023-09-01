public class subsequence {
    public static void sub(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char current=str.charAt(idx);
        //to do
        sub(str, idx+1, newstr+current);
        //to not { time complexity is 2^n}
        sub(str, idx+1, newstr);
    }
    public static void main(String[] args){
        String str="abc";
sub(str, 0, "");
    }
}
