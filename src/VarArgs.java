import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,4,5,6,7,8);
        mul(2,3,"sai","ram");

    }
    static void mul(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }
    //int...v --> indicates the some int values(any no of arg)
    static void fun(int...v) {
        System.out.println(Arrays.toString(v));

    }
}
