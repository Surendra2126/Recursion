import java.util.Scanner;
public class BinaryToDecimal {
    
    static int decimal(String s, int i, int result) {
        if (i == s.length()) {
            return result;
        }

        int digit = s.charAt(i) - '0';

        return decimal(s, i + 1, result * 2 + digit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(decimal(s, 0, 0));
    }
}
    

