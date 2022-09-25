// approach  --> arr = 7,9,1,2,3        key = 2
// find pivot =1;
// if pivot <= key <= arr[n-1] binary search in right part
//                      else --> bs in left part

public class SearchInRotatedArray {
    public static void main(String[] args) {

        int arr[] = {7,9,1,2,3};
        int key = 2;
        int pivot = findpivot(arr);
//        System.out.println(pivot);
        if (key >= arr[pivot] && key<= arr[arr.length-1]){
            System.out.println(binarySearch(arr,pivot,arr.length-1,key));
        }else{
            System.out.println(binarySearch(arr,0,pivot-1,key));
        }
    }

    private static int binarySearch(int[] arr, int pivot, int i, int key) {
        int st =0;
        int end = arr.length-1;
        while (st<end){
            int mid = st+(end-st)/2;
            if (arr[mid]<key){
                st = mid+1;
            } else if (arr[mid]>key) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int findpivot(int[] arr) {
        int st =0; int end = arr.length;
        while(st<end){
            int mid = st+(end-st)/2;
            if (arr[mid]>arr[0]){
                st = mid+1;
            }else{
                end = mid;
            }
        }
        return st;
    }
}
