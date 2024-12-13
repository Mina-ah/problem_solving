import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {

    public static void main(String args[]){
        int arr[]={23,45,67,67,89,89,23,17};
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}