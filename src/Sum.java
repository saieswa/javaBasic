import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
         //sum();

       //  int ans=sum2();
        //System.out.println(ans);

        int ans=sum3(2,3);
        System.out.println(ans);

    }

    //pass the value of no. when you are calling the method in main()
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;

    }
    //return tye
    static int sum2(){
        Scanner sai=new Scanner(System.in);
        System.out.println("enter num1:");
        int num1=sai.nextInt();
        System.out.println("Enter num2:");
        int num2=sai.nextInt();
        int sum=num1+num2;
        return sum;

    }
    static void sum(){
        Scanner sai=new Scanner(System.in);
        System.out.println("enter num1:");
        int num1=sai.nextInt();
        System.out.println("Enter num2:");
        int num2=sai.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
}
