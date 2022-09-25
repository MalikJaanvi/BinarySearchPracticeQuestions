import java.util.Arrays;

class AllocationOfBooks{
    public static void main(String[] args) {
        int[] arr= {10,50,30,40,20};
        int n = arr.length;
        int m =2;

        System.out.println(allocateBook(arr,n,m));
    }

    private static int allocateBook(int[] arr, int n, int m) {

        int st =0;
        int end = Arrays.stream(arr).sum();

        int ans =-1;

        while(st<end){
            int mid = st+(end-st)/2;
            if (possibleSol(arr,n,mid,m)){
                ans = mid;
                end = mid;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    private static boolean possibleSol(int[] arr, int n, int mid, int m) {
        int stCount=1;
        int PgSum =0;

        for (int i=0;i<arr.length;i++){
            if (PgSum+arr[i]<=mid){
                PgSum += arr[i];
            }else {
                stCount++;
                if (stCount > m || arr[i]>mid){
                    return false;
                }
                PgSum =0;
                PgSum += arr[i];
            }
        }
        return true;
    }
}