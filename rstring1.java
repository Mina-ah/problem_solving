public class rstring1 {
    public static String skipaString(String str,String newstr,int idx){
        if(idx==str.length()){
         return newstr;
        }
        char current=str.charAt(idx);
        if(current=='a'){
            return skipaString(str, newstr, idx+1);
        }
        else{
            return skipaString(str, newstr+current, idx+1);
        }
    }
    public static void main(String[] args) {
       String str="abacvbx";
       System.out.println(skipaString(str, "", 0)); 
    }
}
