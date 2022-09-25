import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabpaab";

        String s = removeDuplicates(str);
        System.out.println(s);
    }
    static String removeDuplicates(String str){
//        Stack<Character> s = new Stack<>();
//        for (int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if (s.isEmpty() == false && s.peek() == ch){
//                s.pop();
//            }else {
//                s.push(ch);
//            }
//        }
//        String ans ="";
//        for (char i :s){
//            ans += i;
//        }
//        return ans;
        if (str.length()==1){
            return str;
        }
        StringBuilder s = new StringBuilder("");
        for (int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            int sbLen = s.length();
            if (sbLen > 0 && s.charAt(sbLen-1)==currchar){
                s.deleteCharAt(sbLen-1);
            }else{
                s.append(currchar);
            }
        }
        return s.toString();
    }
}
