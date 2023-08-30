public class sort{
    public static boolean sorting(int idx,int arr[]){
        if(idx==arr.length-1){
            return true;
        }
if(arr[idx]<arr[idx+1]){
    return sorting(idx+1, arr);
}
else{
    return false;
}
    }
    public static void main(String[] args){
        int arr[]={2,1,4,5,6};
        int idx=0;
       boolean bool= sorting(idx, arr);
       System.out.println(bool);

    }
}