//calculator prog
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);

        int ans=0;
        while(true){
            //take a operator as input
            System.out.println("enter the operator");
            char op=sai.next().trim().charAt(0);

            if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%'){
                //input 2 no.
                int num1= sai.nextInt();
                int num2=sai.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1+num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }

            }
            System.out.println(ans);
        }
    }
}
