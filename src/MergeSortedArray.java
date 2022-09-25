public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        int i=1;
        merge(arr1,3,arr2,3);
    }

    private static void merge(int[] arr1, int n1, int[] arr2, int n2) {
        int i = n1-1;
        int j  = n2 -1;

        int k = n1+n2-1;

        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                arr1[k] = arr1[i];
                k--;i--;
            }else{
                arr1[k] = arr2[j];
                k--;j--;
            }
        }
        while(j>=0){
            arr1[k] = arr2[j];
            k--;j--;
        }
        for (int m:arr1){
            System.out.println(m);
        }
    }
}
