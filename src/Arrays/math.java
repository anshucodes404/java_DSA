import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int n = in.nextInt();
        int ans = 1;
        int term;
        for (int i = 0; i < n; i++) {
            term = in.nextInt();
            ans *= term;
        }
        in.close();
        System.out.println("Answer" + ans);
    }
}
