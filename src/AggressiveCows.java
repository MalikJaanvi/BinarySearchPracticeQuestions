import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr= {4,2,1,9,6};
        int k =2;

        Arrays.sort(arr);

        int align = alignCows(arr,arr.length,k);
        System.out.println(align);
    }
    static int alignCows(int[] arr, int n , int k){

        int st =0;
        int max =-1;
        for (int i=0;i<n;i++){
            if (arr[i]>=max){
                max = arr[i];
            }
        }

        int end = max;
        int ans = -1;

        while(st<end){
            int mid = st+(end-st)/2;
            if (isPossible(arr,n,k,mid)){
                ans = mid;
                st = mid +1;
            }else {
                end = mid;
            }
        }

        return ans;
    }
    static boolean isPossible(int[] arr, int n, int k, int mid){
        int cows =1;
        for (int i=0;i<n;i++){
            if (arr[i]-arr[0] >= mid){
                if(cows == k) {
                    return true;
                }
                cows ++;
            }
        }
        return false;
    }
}
