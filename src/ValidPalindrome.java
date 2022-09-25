public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan,a canal panama";
//            String str = "&Na*an";
//        String str = " , ";

//        boolean isPalin = checkPalindrome(str);
        boolean checkPalin = CheckPalin(str);
        System.out.println(checkPalin?"Palindrome":"not");
    }

    private static boolean CheckPalin(String str) {
        int st =0;int end = str.length()-1;
        while (st<=end){
            while(st<=end && !Character.isLetterOrDigit(str.charAt(st))){
                st++;
            }
            while(st<=end && !Character.isLetterOrDigit(str.charAt(end))){
                end--;
            }
            if (st<=end && Character.toLowerCase(str.charAt(st)) != Character.toLowerCase(str.charAt(end))){
                return false;
            }
            st++;end--;
        }
        return true;
    }

    private static boolean checkPalindrome(String str) {

        str = str.toLowerCase();

        str = str.replaceAll("[^a-z0-9]","");

        int n = str.length();
        int st=0;int end =n-1;
        while(st<=end){
            char stValue = str.charAt(st);
            char endValue = str.charAt(end);
            if (stValue != endValue){
                return false;
            }
            st++;end--;
        }
        return true;
    }
}
