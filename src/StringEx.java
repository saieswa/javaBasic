public class StringEx {
    public static void main(String[] args) {
        String msg=greet();
        System.out.println(msg);

        String msg1=myGreet("sai");
        System.out.println(msg1);
    }

    static String myGreet(String a){
        String message="HI"+a;
        return message;
    }
    static String greet(){
        String greeting="how r u?";
        return greeting;
    }
}
