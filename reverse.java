public class reverse{
public static void srev(int idx,String str){
if(idx==0){
    System.out.println(str.charAt(idx));
return;
}
    System.out.println(str.charAt(idx));
    srev(idx-1,str );

}
    public static void main(String[] args){
    String str="Mina";
    int idx=str.length()-1;
    srev(idx, str);
    }
}