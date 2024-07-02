//To calculate Fibonacci Series up to n numbers.
// (0,[1),1],2,3,5,8,13...
// 0+1=1,1+1=2,1+2=3
/* stage-fib
    0 - 0
    1 -1
    2-1
    3-2
    4-3
    5-5
    6-8
    7-13....
 */
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        int n = sai.nextInt();
        int f = sai.nextInt();
        int s = sai.nextInt();

        System.out.println(f);
        System.out.println(s);

        for (int i = 0; i <= n; i++) {
            int t = f + s;
            System.out.println(t);
            f = s;
            s = t;

        }
        System.out.println(s);

    }
}

