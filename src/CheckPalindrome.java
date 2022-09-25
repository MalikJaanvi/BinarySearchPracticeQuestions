public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Na22#an";

        str = str.toLowerCase();
        System.out.println(str);
        str = str.replaceAll("[^a-z0-9]","");
        System.out.println(str);

        boolean flag = true;
        int st =0;int end=str.length()-1;
        while(st<=end){
            if (str.charAt(st) != str.charAt(end)){
                flag = false;
            }
            st++;end--;
        }
        System.out.println(flag);
    }
}
