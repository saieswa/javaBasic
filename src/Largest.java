// Q: Find the largest of the 3 number
import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        int a=sai.nextInt();
        int b=sai.nextInt();
        int c=sai.nextInt();

        int max=a;
        if (b > max) {
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}

// in bulit formula to find max

// int max=Math.max(c,Math.max(a,b);
//sout(max);