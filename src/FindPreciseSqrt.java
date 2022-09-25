public class FindPreciseSqrt {
    public static void main(String[] args) {
        int key = 10;
        int Pricision = 3;
        long tempSqrt = findSqrtUsingBS(key);
        System.out.println(tempSqrt);
        double sqrt = PricisionSqrt(key,tempSqrt,Pricision);
        System.out.println(sqrt);
    }

    private static double PricisionSqrt(int key, long tempSqrt,int Precision) {
        double factor =1;
        double ans =tempSqrt;
        for (int i=0;i<Precision;i++){
            factor = factor/10;
            for (double j=ans;j*j<key;j = j+factor){
                ans =j;
            }
        }
        return ans;
    }

    private static long findSqrtUsingBS(int key) {
        long st = 0; long end = key;
        long ans =0;
        while(st<=end){
            long mid = st+(end-st)/2;
            if (mid*mid > key){
                end = mid-1;
            } else if (mid*mid<key){
                st = mid+1;
                ans = mid;
            } else {
                ans = mid;
                return mid;
            }
        }
        return ans;
    }
}
