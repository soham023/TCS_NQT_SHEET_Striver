import java.util.HashMap;
public class Arrays_Remove_Duplicates {
    public static void Remove_Duplicates_From_Unsorted_Array(int arr[] ) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                map.put(arr[i],1);
            }
        }

    }
    
    public static int Remove_Duplicates_From_sorted_Array(int arr[]) {
        // 2 pointer
        int n = arr.length; 
        int i = 0;
        for(int j = 1; j < n ; j ++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i + 1;
        
    }
    public static void main(String[] args) {

        int arr[] = {3,6,4,9,6,5,6,5};
        Remove_Duplicates_From_Unsorted_Array(arr);
        System.out.println();

        int array[] = {1 , 1, 2, 2, 3 , 3, 4, 6};
        int k = Remove_Duplicates_From_sorted_Array(array);
        for(int i = 0 ; i < k ; i++){
            System.out.print(array[i]+" ");
        }
        
    }
}
