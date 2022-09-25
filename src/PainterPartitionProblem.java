import java.util.Arrays;

public class PainterPartitionProblem {
    public static void main(String[] args) {
        int arr[] = {5,5,5,5};
        int k = 2;

        int partion = findSection(arr,arr.length,k);
        System.out.println(partion);
    }

    private static int findSection(int[] arr, int n, int k) {
        int st =0;
        int end = Arrays.stream(arr).sum();

        int ans = -1;

        while (st<=end){
            int mid = st+(end-st)/2;
            boolean poss = possibleSol(arr,n,mid,k);

            if (poss){
                ans = mid;
                end = mid-1;
            }else{
                st = st+1;
            }
        }
        return ans;
    }

    private static boolean possibleSol(int[] arr, int n, int mid, int k) {
        int painter =1;
        int section =0;
        for (int i=0;i<n;i++){
            if (section + arr[i]<=mid){
                section += arr[i];
            }else{
                painter ++;
                if (painter > k || arr[i]>section){
                    return false;
                }
                section = arr[i];
            }
        }
        return true;
    }
}
