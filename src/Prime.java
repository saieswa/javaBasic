//prime no list
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        int start = sai.nextInt();
        int end = sai.nextInt();
        for (int i = start; i <= end; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
