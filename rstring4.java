import java.util.ArrayList;

public class rstring4 {
    public static ArrayList<String> subsequences(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char current=up.charAt(0);
        ArrayList<String> left=subsequences(p+current, up.substring(1));
        ArrayList<String> right=subsequences(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
       System.out.println(subsequences("", "abc")); 
    }
}
