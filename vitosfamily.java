import java.util.*;

public class vitosfamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();  // Number of test cases

        for (int t = 1; t <= T; t++) {
            System.out.println("\n--- Test Case " + t + " ---");

            System.out.print("Enter number of relatives: ");
            int N = sc.nextInt();

            int[] a = new int[N];
            System.out.print("Enter street numbers: ");
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);  // Sort to find median
            System.out.println("Sorted street numbers: " + Arrays.toString(a));

            int median = a[N / 2];
            System.out.println("Chosen median (house to move): " + median);

            int totalDistance = 0;
            for (int i = 0; i < N; i++) {
                int dist = Math.abs(a[i] - median);
                System.out.println("Distance from " + a[i] + " to " + median + " = " + dist);
                totalDistance += dist;
            }

            System.out.println("Total minimum distance: " + totalDistance);
        }

        sc.close();
    }
}



// n=6
// arr= {7,14,3,8,6,10}
// sort=3,6,7,8,10,14
// median = 7
// distances= 4+1+0+1+3+7= 16