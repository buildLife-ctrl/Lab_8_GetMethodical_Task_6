import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = InputHelper.getNonZeroLenString(scan, "What is the message you want to output?");
        InputHelper.prettyHeader(scan, msg);
    }
}
