import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordPalindrome {
    public static void main(String[] args) {
        String[] arr = {"I"," ","a","m"," ","J","a","n","i"," ","m","a"};

        palindrome (arr,arr.length);
    }
    static void palindrome(String[] arr,int n){
        List<String> str = new ArrayList<>();
        int st=0;int end =0;
        for (int i=0;i<n;i++){
            if (i== n-1){
                --st;
                reverse(arr,st,end);
            }
            if (arr[i] == " "){
                end =i-1;
                reverse(arr,st,end);
                st = end+2;
            }
        }
        for (String i:arr){
            System.out.println(i);
        }
    }

    private static void reverse(String[] arr, int st, int end) {
        while (st <= end) {
            String temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
