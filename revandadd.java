import java.util.*;

public class revandadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original= sc.nextInt();

        while (true) {
            int temp = original, rev = 0;

            // Reverse the number using 3 lines:
            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp/10;
            }

            if (original== rev) break;  // Palindrome check
            original+= rev;             // Reverse and add
        }

        System.out.println(original);   // Final palindrome number
        sc.close();
    }
}


// ip = 78
// 87 + 78 = 165

// 165 + 561 = 726

// 726 + 627 = 1353

// 1353 + 3531 = 4884

// ✅ 4884 is a palindrome