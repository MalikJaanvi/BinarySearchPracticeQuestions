import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.replaceAll(" ","@40");
        System.out.println(str);
    }
}
