import java.util.Arrays;
public class Arrays_Median {
    public static void Median(int arr[]) {
        
        int n = arr.length;
        Arrays.sort(arr);
        if(n % 2 == 0){
            int index1 = (n/2);
            int index2 = (n/2) - 1;
            System.out.println((double)(arr[index1] + arr[index2])/2);
    
        }
        else{
            System.out.println(arr[n/2]);;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 2, 5, 6};
        Median(arr);
    }    
}
