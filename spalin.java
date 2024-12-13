public class spalin {
    public static void main(String[] args) {
        String str= "mina is st anim";
        str=str.replaceAll("//s+", "").toLowerCase();
        int low=0,high=str.length()-1,flag=0;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
           flag=1;
        break;    
        }
        low++;
        high--;
        }
if(flag==1)
System.out.println("not palindrome");
else
System.out.println("palindrome");
    }
}
