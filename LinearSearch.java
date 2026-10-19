 import java.util.Scanner;
 public class LinearSearch {
   
    static int search(int[] a, int x, int i) {
        if (i == a.length) {
            return -1;
        }

        if (a[i] == x) {
            return i;
        }

        return search(a, x, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(search(a, x, 0));
    }
}
    

