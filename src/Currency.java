//Input currency in rupees and output in USD.

import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        long rupees= sai.nextLong();
        float dollars=rupees/64;
        System.out.println(dollars);


    }
}
