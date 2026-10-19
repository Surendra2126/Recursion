 import java.util.Scanner;
 public class OddNumberOneToN {
   
    static void printOdd(int n) {
        if (n < 1) {
            return;
        }

        printOdd(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            n--;
        }

        printOdd(n);
    }
}
    

