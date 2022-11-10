import java.util.*;
public class Arrays_Count_Frequency {
    public static void Count_Frequency_Of_Array (int arr[]) {
        //
        HashMap <Integer , Integer> hm = new HashMap<>();
        
        for(int i = 0; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1 );
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        // traverse map using keyset
        Set <Integer> keyset = hm.keySet();
        for(Integer key : keyset){
            System.out.println(key + " appears for " + hm.get(key) +" times" );
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        Count_Frequency_Of_Array(arr);
    }
}
