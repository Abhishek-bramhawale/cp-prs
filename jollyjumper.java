import java.util.*;

public class jollyjumper {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3};
        int n = arr.length;

        // Step 1: Create diff array
        Set<Integer> diff = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            diff.add(Math.abs(arr[i] - arr[i + 1]));
        }

        //diff={3,2,1}; n={1,2,3} 

        // Step 2: Create required set from 1 to n-1
        boolean isJolly = true;
        for (int i = 1; i < n; i++) {
            if (!diff.contains(i)) {
                isJolly = false;
                break;
            }
        }

        if (isJolly)
            System.out.println("Jolly");
        else
            System.out.println("Not Jolly");
    }
}


// arr={1,4,2,3}
// n=4 so we want to check if {1,2,3} are present in 
// diff= {3,2,1}
// yes so 
// JOLLY