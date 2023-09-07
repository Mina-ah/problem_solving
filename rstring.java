public class rstring {
    public static String skipaword(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipaword(str.substring(5));
        }
        else{
            return str.charAt(0)+skipaword(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str="mynamisappleand";
        System.out.println(skipaword(str));
    }
}
