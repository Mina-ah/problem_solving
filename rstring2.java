public class rstring2{
    public static void subset(String p,String up){
        if(up.isEmpty()){
            
            System.out.println(p);
            return;
        }
        char current=up.charAt(0);
        subset(p+current, up.substring(1));
        subset(p, up.substring(1));
    }
    public static void main(String[] args) {
        subset("", "abc");
    }
}