public class firstlast {
    public static int first=-1;
    public static int last=-1;
    public static void fl(int idx,char character,String str){
        
        if(idx==str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
        }
        char current=str.charAt(idx);
        if(current==character){
            if(first==-1)
            first=idx;
            else
            last=idx;
        }
        fl(idx+1,character,str);


    }
    public static void main(String[] args){
    String str="abaahtncap";
    char character='a';
    fl(0,character,str);
    }
}
