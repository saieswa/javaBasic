public class Shadowing {
    static int x=90;//this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=40;//cls variable at line 2 is shodowrd by this
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);//90
    }
}
