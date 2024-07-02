public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int no=num;

        int arm=0;
        int rem;
        while(no>0){
            rem=no%10;
            arm=arm+(rem*rem*rem);
            no=no/10;
        }
        if(arm==num){
            System.out.println(num+ " is an Armstrong number ");
        }
        else{
            System.out.println(num+"  is not an Armstrong number");
        }

    }
}
