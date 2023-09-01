public class repeatingstr{
    public static boolean[] map=new boolean[26];
    public static void repeat(String str,int idx,String newstr){
      if(idx==str.length()){
        System.out.println(newstr);
        return;
      }
        char current=str.charAt(idx);
       if(map[current-'a']){
        repeat(str, idx+1, newstr);
       }
       else{
        newstr+=current;
        map[current-'a']=true;
        repeat(str, idx+1, newstr);
       }

    }
    public static void main(String[] args){
        String str="qppnnhioiaab";
        repeat(str, 0, "");
    }
}