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
			System.out.println("Sunday Неділя Воскресенье");
			break;
		case 2:
			System.out.println("The day is: ");
			System.out.println("Monday Понеділок Понедельник");
			break;
		case 3:
			System.out.println("The day is: ");
			System.out.println("Tuesday Вівторок Вторник");
			break;
		case 4:
			System.out.println("The day is: ");
			System.out.println("Wednesday Середа Среда");
			break;
		case 5:
			System.out.println("The day is: ");
			System.out.println("Thursday Четвер Четверг");
			break;
		case 6:
			System.out.println("The day is: ");
			System.out.println("Friday П'ятниця Пятница");
			break;
		case 7:
			System.out.println("The day is: ");
			System.out.println("Saturday Субота Субота");
			break;
		default:
			System.out.println("Wrong number");
			break;
		}
		
	}
}
