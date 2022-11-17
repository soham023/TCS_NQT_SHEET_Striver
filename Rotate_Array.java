public class Rotate_Array {

    public static void swap(int arr[], int a , int b, int k) {
        for(int i = 0; i < k ; i++){
            int temp = arr[ a + i ];
            arr[a + i] = arr[ b + i];
            arr[b + i] = temp;
        }
    }
    //Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
    public static void Block_Swap(int arr[] , int i , int k , int n) {
        if( k == 0 || k == n){
            return;
        }
        if( k == n - k){
            swap(arr, i , n - k + i, k);
            return;
        }
        else if( k < n - k){
            swap(arr, i, n - k + i , k);
            Block_Swap(arr, i, k, n - k);
        }
        else{
            swap(arr, i, k, n - k);
            Block_Swap(arr, n - k + i, 2 * k - n, k);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 4;        
        int n = 7;   
        Block_Swap(arr, 0, k, n);
        for(int i = 0; i< n ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
