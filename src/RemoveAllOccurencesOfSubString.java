import java.util.Scanner;

public class RemoveAllOccurencesOfSubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "hellomynamehellohhelloello";
        String part = "hello";

        while(str.length() !=0 && str.indexOf(part) !=  -1){
            str = str.replaceAll(part,"");
        }
        System.out.println(str);
    }
}
