public class FindPivotInAnArray {
    public static void main(String[] args) {
        int[] arr= {7,9,1,2,3};
        int st =0; int end = arr.length;
        while(st<end){
            int mid = st + (end-st)/2;
            if (arr[mid]>arr[0]){
                st = mid+1;
            }else{
                end = mid;
            }
        }
        System.out.println(st);
    }
}
