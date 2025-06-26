import java.util.*;

public class primaryarith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
            System.out.println("Enter the numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int carry = 0, cnt = 0;
            while (a > 0 || b > 0) {
                int sum = (a % 10) + (b % 10) + carry;
                carry = (sum > 9) ? 1 : 0;
                if (carry == 1) cnt++;
                a /= 10;
                b /= 10;
            }

            if (cnt == 0)
                System.out.println("No carry operation.");
            else if (cnt == 1)
                System.out.println("1 carry operation.");
            else
                System.out.println(cnt + " carry operations.");
        
    
}}
