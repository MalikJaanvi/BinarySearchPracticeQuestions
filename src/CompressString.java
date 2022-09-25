public class CompressString {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','c','c'};

        compress(chars);
    }

    private static int compress(char[] chars) {
        int i=0;
        int idx =0;
        while(i<chars.length){
            int j =i+1;
            while(j< chars.length && chars[j]==chars[i]){
                j++;
            }
            chars[idx++] = chars[i];

            int count = j-i;
            if (count>1){
                String ch = String.valueOf(count);
                for (char c =0;c<ch.length();c++){
                    chars[idx++] = ch.charAt(c);
                }
            }
            i=j;
        }
        for (char c:chars){
            System.out.println(c);
        }
        return idx;
    }
}
