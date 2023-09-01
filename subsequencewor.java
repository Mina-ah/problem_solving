import java.util.HashSet;
public class subsequencewor {
    public static void sub(String str,int idx,String newstr,HashSet<String> hash){
if(idx==str.length()){
    if(hash.contains(newstr)){
        return;
    }
    else{
        System.out.println(newstr);
        hash.add(newstr);
        return;
    }
}

        char current=str.charAt(idx);
sub(str, idx+1, newstr+current, hash);
sub(str, idx+1, newstr, hash);
    }
    public static void main(String[] args){
HashSet<String> hash=new HashSet<>();
String str="aaa";
sub(str, 0, "", hash);
    }
}
