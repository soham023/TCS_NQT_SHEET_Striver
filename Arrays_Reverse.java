public class Arrays_Reverse {

    public static void Reverse_of_Array(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,9,6,7};
        Reverse_of_Array(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
