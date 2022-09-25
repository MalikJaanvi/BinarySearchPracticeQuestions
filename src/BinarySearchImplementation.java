public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] arr = {5,9,10,45,75,84,96,98};
        int target = 9;

        int idx = search(arr,target);
        System.out.println(idx);
    }

    private static int search(int[] arr, int target) {
        int st = 0;int end = arr.length;

        while( st <= end ){
            int mid = st+ (end-st)/2;
            if(arr[mid]<target){
                st = mid+1;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else{
                return mid;

            }
        }
        return -1;
    }
}
