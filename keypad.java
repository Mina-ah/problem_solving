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
        //time complexity is 4^n because for each character its going to be 2 choices here 2 and 3 are two different characters so the time complexity will be 4 to the power n
    public static void main(String[] args){
        String str="23";
        key(str, 0, "");
    }
}
