 import java.util.Scanner;
 public class RemoveCharacter {
   
    static String remove(String s, char c, int i) {
        if (i == s.length()) {
            return "";
        }

        char ch = s.charAt(i);
        String rest = remove(s, c, i + 1);

        if (ch == c) {
            return rest;
        }

        return ch + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(remove(s, c, 0));
    }
}
    

