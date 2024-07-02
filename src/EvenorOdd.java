import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        int a=sai.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
