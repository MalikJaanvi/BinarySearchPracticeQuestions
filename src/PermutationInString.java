public class PermutationInString {
    public static void main(String[] args) {
        String str = "ab";
        String s = "a";

        System.out.println(checkPermutation(str,s));
    }
    static boolean checkPermutation(String str, String s){
        int[] countS = new int[26];
        for (int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';
            countS[idx]++;
        }

        int[] countStr = new int[26];
        int st =0;int winSize = s.length();
        int i=0;
        while(i<winSize){
            int idx = str.charAt(i)-'a';
            countStr[idx]++;
            i++;
        }

        if(checkEqual(countS,countStr)){
            return true;
        }

        while(i<str.length()){
            int newIdx = str.charAt(i)-'a';
            countStr[newIdx]++;

            int oldIdx = str.charAt(i-winSize)-'a';
            countStr[oldIdx]--;


            if(checkEqual(countS,countStr)){
                return true;
            }

            i++;
        }
        return false;
    }
    static boolean checkEqual(int[] CountS, int[] CountStr){
        for (int i=0;i<26;i++){
            if(CountS[i] != CountStr[i]){
                return false;
            }
        }
        return true;
    }
}
