public class permutation {
    public static void per(String str,String permut){
        if(str.length()==0){
            System.out.println(permut);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            per(newstr,permut+current);
        }

    }
    public static void main(String[] args) {
        String str="abc";
        per(str,"");
    }
}
