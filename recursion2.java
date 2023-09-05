public class recursion2 {
public static int roundbinarysearch(int[] arr,int s,int e,int key){
    if(s>e){
        return -1;
    }
    int m=s+(e-s)/2;
    if(key==arr[m]){
        return m;
    }
    if(arr[s]<=arr[m]){
        if(key>=arr[s] && key<=arr[m]){
            return roundbinarysearch(arr, s, m-1, key);
        }
        else{
            return roundbinarysearch(arr, m+1, e, key);
        }
    }
    if(key>=arr[m] && key<=arr[e]){
        return roundbinarysearch(arr, m+1, e, key);
    }
    else{
        return roundbinarysearch(arr, s, m-1, key);
    }
}
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        System.out.println(roundbinarysearch(arr, 0, arr.length-1, 3));
    }
}
