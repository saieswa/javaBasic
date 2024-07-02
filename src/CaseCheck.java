import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        char ch = sai.next().trim().charAt(0);


        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Not an alphabet character");
        }
    }
}


// .trim() ---> remove the extra space
/*  ex: String word ="hello";
    sout(word.charAt(0));
    o/p:h
 */
