import java.util.*;

public class threen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Starting 3n+1 sequence:");

        // Loop to apply 3n+1 logic
        while (n > 0) {
            System.out.print(n + " "); // Print current number

            if (n == 1) {
                System.out.println("\nReached 1. Sequence complete.");
                break;
            }

            // Show the operation being performed
            if (n % 2 == 0) {
                System.out.println(" (even, so " + n + " / 2)");
                n = n / 2;
            } else {
                System.out.println(" (odd, so 3 * " + n + " + 1)");
                n = 3 * n + 1;
            }
        }

        sc.close();
    }
}




//  given integer n, repeat the process:

// If n is even, n = n / 2

// Else, n = 3 * n + 1
// Until n becomes 1.