public class keypad {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void key(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char current=str.charAt(idx);
        String mapping=keypad[current-'0'];
        for(int i=0;i<mapping.length();i++){
key(str, idx+1, combination+mapping.charAt(i));
        }    
        }
    public static void main(String[] args){
        String str="23";
        key(str, 0, "");
    }
}
