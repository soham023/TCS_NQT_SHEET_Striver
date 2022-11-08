

public class Arrays_Smallest {
    public static int  smallest (int arr[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            Smallest = Math.min(Smallest, arr[i]);
        }
        return Smallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,6,34,65};
        System.out.println("Smallest Element in an array : "+ smallest(arr));
    }
}
