import java.util.Scanner;
public class SortedArray {
    
    static boolean sorted(int[] a, int i) {
        if (i == a.length - 1) {
            return true;
        }

        if (a[i] > a[i + 1]) {
            return false;
        }

        return sorted(a, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (sorted(a, 0)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
    

