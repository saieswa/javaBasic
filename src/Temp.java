import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        System.out.println("enter temp in C: ");
        float tempC = sai.nextFloat();

        float tempF=(tempC *9/5)+32;

        System.out.println(tempF);

    }
}
