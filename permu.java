import java.util.*;

public class permu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take 2 input strings only once
        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        StringBuilder result = new StringBuilder();

        // Mark visited characters in arr2
        boolean[] visited = new boolean[arr2.length];

        // Loop through both arrays to find common characters
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    result.append(arr1[i]);
                    visited[j] = true;  // mark this character as used
                    break;
                }
            }
        }

        // Convert result to char array and sort
        char[] resArr = result.toString().toCharArray();
        Arrays.sort(resArr);
        System.out.println(new String(resArr));
    }
}



// rain  
// inner  
// inr  
// pretty  
// women  
// e  