import java.util.ArrayList;

public class recursion1 {
    public static ArrayList<Integer> findAllindexes(int idx,int[] arr,int key){
       ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length){
            return list;
        }
        if(arr[idx]==key){
            list.add(idx);
        }
        ArrayList<Integer> answerfromabove=findAllindexes(idx+1, arr, key);
        list.addAll(answerfromabove);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5,6,4};
        int key=4;
        System.out.println(findAllindexes(0, arr, key));
    }
}
