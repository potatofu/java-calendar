package mycalendar;

import java.util.Scanner;

public class Calendar {
	
	public void printSampleCalendar(int year, int month) {
		System.out.printf("     <<%4d %3d>>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxday = getMaxDaysofMonth(month);
		
		for(int i=1; i<= maxday; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		
	}
	public static final int[] MAX_DAYS = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
	
	public int getMaxDaysofMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	public static void main(String[] args) {
		
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		
		int month = 1;
		
		while(true) {
			System.out.println("달을 입력해주세요: ");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month ==-1) {
				break;
			}
			if(month>12) {
				continue;
			}
			System.out.printf("%d월은 %d일 까지입니다.\n", month, cal.getMaxDaysofMonth(month));

		}
		System.out.println("아룡~");
		scanner.close();
	}
}
