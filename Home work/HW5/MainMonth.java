package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMonth {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numb;
		System.out.println("Enter number month:");
		numb=Integer.parseInt(br.readLine());
		getDaysToMonth(numb);
	}
	
	static int[] daysMonth= {31, 28,31,30,31,30,31,31,30,31,30,31};
	static String[] nameMonth= {"January", "February", "March", "April", "May", "June",	"July", "August", "September", "October", "November", "December"};
	
	public static void getDaysToMonth(int numb) {
        switch (numb) {
        case 1:
            System.out.println("In "+numb +" month, "+nameMonth[0] + " is: "+daysMonth[0]+" days");
            break;
        case 2:
            System.out.println("In "+numb +" month, "+nameMonth[1] + " is: "+daysMonth[1]+" days");
            break;
        case 3:
            System.out.println("In "+numb +" month, "+nameMonth[2] + " is: "+daysMonth[2]+" days");
            break;
        case 4:
            System.out.println("In "+numb +" month, "+nameMonth[3] + " is: "+daysMonth[3]+" days");
            break;
        case 5:
            System.out.println("In "+numb +" month, "+nameMonth[4] + " is: "+daysMonth[4]+" days");
            break;
        case 6:
            System.out.println("In "+numb +" month, "+nameMonth[5] + " is: "+daysMonth[5]+" days");
            break;
        case 7:
            System.out.println("In "+numb +" month, "+nameMonth[6] + " is: "+daysMonth[6]+" days");
            break;
        case 8:
            System.out.println("In "+numb +" month, "+nameMonth[7] + " is: "+daysMonth[7]+" days");
            break;
        case 9:
            System.out.println("In "+numb +" month, "+nameMonth[8] + " is: "+daysMonth[8]+" days");
            break;
        case 10:
            System.out.println("In "+numb +" month, "+nameMonth[9] + " is: "+daysMonth[9]+" days");
            break;
        case 11:
            System.out.println("In "+numb +" month, "+nameMonth[10] + " is: "+daysMonth[10]+" days");
            break;
        case 12:
            System.out.println("In "+numb +" month, "+nameMonth[11] + " is: "+daysMonth[11]+" days");
            break;
        default:
            System.out.println("Number month is wrong!!");
            break;
        	}
	
		}
}
