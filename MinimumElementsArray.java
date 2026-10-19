import java.util.Scanner;
public class MinimumElementsArray {
    
    static int minimum(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }

        int min = minimum(a, i + 1);

        if (a[i] < min) {
            return a[i];
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(minimum(a, 0));
    }
}
    

