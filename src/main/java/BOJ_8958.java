import java.util.Scanner;


public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String tc = sc.next();
            int count = 1;
            int score = 0;
            for (int k = 0; k < tc.length(); k++) {
                if (tc.charAt(k) == 'O') {
                    score += count;
                    count += 1;
                } else {
                    count = 1;
                }
            }

            System.out.println(score);
        }
    }
}

