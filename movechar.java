public class movechar {
    public static void movechr(int idx,String str,int count,String newstr){
        if(idx==str.length()){
            for(int i=1;i<=count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char current=str.charAt(idx);
        if(current=='x'){
            count++;
            movechr(idx+1,str, count, newstr);
        }
        else{
            newstr+=current;
            movechr(idx+1, str, count, newstr);
        }
    }
    public static void main(String[] args){
String str="axbcxtxxrr";
int idx=0;
int count=0;
String newstr="";
movechr(idx, str, count, newstr);
    }
}
