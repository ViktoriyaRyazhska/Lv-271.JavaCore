package PractiseTask.l4;

public class DayOfWeek {

	private int dayNumber;

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	public DayOfWeek(){
	}
	public DayOfWeek(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public void printDay(){
		switch(this.dayNumber){
		case 1:
			System.out.println("The day is: ");
			System.out.println("Sunday ����� �����������");
			break;
		case 2:
			System.out.println("The day is: ");
			System.out.println("Monday �������� �����������");
			break;
		case 3:
			System.out.println("The day is: ");
			System.out.println("Tuesday ³������ �������");
			break;
		case 4:
			System.out.println("The day is: ");
			System.out.println("Wednesday ������ �����");
			break;
		case 5:
			System.out.println("The day is: ");
			System.out.println("Thursday ������ �������");
			break;
		case 6:
			System.out.println("The day is: ");
			System.out.println("Friday �'������ �������");
			break;
		case 7:
			System.out.println("The day is: ");
			System.out.println("Saturday ������ ������");
			break;
		default:
			System.out.println("Wrong number");
			break;
		}
		
	}
}
