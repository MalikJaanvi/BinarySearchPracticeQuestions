
public class PeekIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int index = findpeek(arr);
        System.out.println(index);
    }

    private static int findpeek(int[] arr) {
        int st =0; int end = arr.length-1;
        while (st<end){
                int mid = st+ (end-st)/2;
                if(arr[mid] < arr[mid+1]){
                    st = mid+1;
                }else{
                    end = mid;
                }
            }
            return st;
    }
}
