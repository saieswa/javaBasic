import java.util.Scanner;
public class Primeno {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        int num = sai.nextInt();

        if (isprime(num)) {
            System.out.println(num + " is a prime no");
        } else {
            System.out.println(num + " is not a prime no");
        }
    }

    static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

