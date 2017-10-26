import java.util.Scanner;

public class SoftHome92 {
    class InvalidNumber extends Exception {
        public InvalidNumber(String msg) {
            super(msg);
        }

        public InvalidNumber() {}
    }

    int  readNumber(int start, int end,int x)throws InvalidNumber{
            if (x <= start || x >= end) {
                throw new InvalidNumber("Pls,input correct number");
            }
            return x;
        }

    public static void main(String[] args) {
        SoftHome92 s = new SoftHome92();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start");
        int start=sc.nextInt();
        System.out.println("Enter end");
        int end=sc.nextInt();

        int[] numbers={2,5,9,-3,0,1000,23,8,10,1};
        for(int i=0;i<numbers.length;i++){
            try {
                System.out.println(s.readNumber(start, end, numbers[i]));

            } catch (InvalidNumber e){
                System.out.println(e);
            }
        }
    }
}
