import java.util.*;

public class polynomail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coeff = new int[4];

        System.out.println("Enter the coefficients of the form ax^3+bx^2+cx+d:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the coefficient: ");
            coeff[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int result = 0;
        for (int i = 0; i < 4; i++) {
            result += coeff[i] * Math.pow(x, 3 - i);
        }

        System.out.println("The value of polynomial is: " + result);
        System.out.println("Conclusion: Thus we have solved Polynomial problem");
    }
}


// Enter the coefficients of the form ax^3+bx^2+cx+d:
// Enter the coefficient: 2
// Enter the coefficient: 4
// Enter the coefficient: 5
// Enter the coefficient: 1
// Enter the value of x: 6
// The value of polynomial is: 607.0
// Conclusion: Thus we have solved Polynomial problem
