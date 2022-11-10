//import java.util.*;
import java.util.Arrays;
//import java.util.Collections;
public class Arrays_Increasing_Decreasing_Order {
    public static void main(String[] args) {
        int arr[] = {4,5,6,3,5,7};

        //sort the array
        Arrays.sort(arr);

        int n = arr.length;
        //print the 1st half in ascending by run a loop
        for(int i = 0 ; i < n/2 ; i++){
            System.out.print( arr[i] +" ");
        }
        //print 2nd half in descending by running a reverse loop
        for(int i = n - 1 ; i >= n/2 ; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
