import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        int P=sai.nextInt();
        int T= sai.nextInt();
        int R= sai.nextInt();

        int SI=(P*T*R)/100;
        System.out.println(SI);

    }
}
