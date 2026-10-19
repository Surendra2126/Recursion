import java.util.Scanner;
public class MaximumElementsArray {
    
    static int maximum(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }

        int max = maximum(a, i + 1);

        if (a[i] > max) {
            return a[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(maximum(a, 0));
    }
}
    

