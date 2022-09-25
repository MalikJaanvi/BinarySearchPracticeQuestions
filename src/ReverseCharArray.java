public class ReverseCharArray {
    public static void main(String[] args) {
//        char[] arr = {'h','e','l','l','o'};
//        int st = 0;
//        int end = arr.length-1;
//
//        while(st<=end){
//            char temp = arr[st];
//            arr[st] = arr[end];
//            arr[end] = temp;
//            st++;end--;
//        }
//        for (char i:arr){
//            System.out.println(i);
//        }

        String s = "abcba";
        String rev = "";
        for (int  ch = s.length()-1;ch>=0;ch--){
            rev += s.charAt(ch);
        }
        System.out.println(rev);
        System.out.println(rev.equals(s)?"y":"n");

        boolean flag = true;
        int st =0;int end = s.length()-1;
        while(st<=end){
            if (s.charAt(st) != s.charAt(end)){
                flag = false;
            }
            st++;end--;
        }
        System.out.println(flag);
        s.equalsIgnoreCase(s);
    }
}
