public class Findfrequency {
    public static void main(String[] args) {
        String str = "testsample";

        char max = findOcc(str);
        System.out.println(max);
    }
    static char findOcc(String str){
        int[] arr = new int[26];
        int count =0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            arr[ch-'a'] = ++count;
        }

        int max = -1;
        int ans = -1;
        for (int i=0;i<26;i++){
            if (max<arr[i]){
                ans = i;
                max = arr[i];
            }
        }
        int finalAns = ans+'a';
        return (char)finalAns;
    }
}
