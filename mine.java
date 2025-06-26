import java.util.*;

public class mine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fieldNum = 1;

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;

            sc.nextLine(); // consume leftover newline

            char[][] field = new char[n][m];
            for (int i = 0; i < n; i++) {
                field[i] = sc.nextLine().toCharArray();
            }

            System.out.println("Field #" + fieldNum++ + ":");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (field[i][j] == '*') {
                        System.out.print("*");
                    } else {
                        int count = 0;

                        // check all 8 surrounding cells manually
                        for (int a = -1; a <= 1; a++) {
                            for (int b = -1; b <= 1; b++) {
                                int x = i + a;
                                int y = j + b;
                                if (x >= 0 && x < n && y >= 0 && y < m && field[x][y] == '*') {
                                    count++;
                                }
                            }
                        }

                        System.out.print(count);
                    }
                }
                System.out.println();
            }
        }
    }
}
