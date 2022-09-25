// if program -->  find number of occurence of key :
//                                                  Occ =   rightOcc - leftOcc+1;


public class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int [] arr = {1,3,3,3,3,7,8,9,11,14};
        int key = 3;
        int firstOcc = leftOcc(arr,key);
        int lastOcc = rightOcc(arr,key,firstOcc);
        System.out.print(firstOcc+" "+lastOcc);
    }

    private static int rightOcc(int[] arr, int key, int leftidx) {
        int st = leftidx;
        int end = arr.length-1;
        int idx =-1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if (arr[mid] == key){
                idx = mid;
                st = mid+1;
            } else if (arr[mid]<key) {
                st = mid+1;
            }else if (arr[mid] > key){
                end = mid-1;
            }
        }
        return idx;
    }

    private static int leftOcc(int[] arr, int key) {
        int st =0;
        int end = arr.length-1;
        int idx =-1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if (arr[mid] == key){
                idx = mid;
                end = mid-1;
            } else if (arr[mid]<key) {
                st = mid+1;
            }else if (arr[mid] > key){
                end = mid-1;
            }
        }
        return idx;
    }
}