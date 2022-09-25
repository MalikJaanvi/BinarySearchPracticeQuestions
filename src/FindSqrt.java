public class FindSqrt {
    public static void main(String[] args) {
        int key = 64;
        int sqrt = findSqrtUsingBS(key);
        System.out.println(sqrt);
    }

    private static int findSqrtUsingBS(int key) {
        int st = 0; int end = key;
        while(st<=end){
            int mid = st+(end-st)/2;
            if (mid*mid > key){
                end = mid-1;
            } else if (mid*mid<key){
                st = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
