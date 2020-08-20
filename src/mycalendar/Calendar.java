package mycalendar;

public class Calendar {
	
	public void printSampleCalendar(int year, int month) {
		System.out.printf("     <<%d년 %d월>>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int weekday = getWeekDay(year, month, 1);
		
		//print blank line
		for(int i=0; i<weekday; i++) {
			System.out.print("   ");
		}
		
		int maxday = getMaxDaysofMonth(year, month);
		int count = 7- weekday;
		int delim = (count < 7) ? count: 0;
		
		//print first line
		for(int i=1; i<= count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		//print second to last line
		for(int i=(count+1); i<= maxday; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		
	}
	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;

		final int STANDARD_WEEKDAY = 3; //Thursday
		
		int count = 0;
		
		for(int i =year; i < syear; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		for (int i=1; i<month; i++) {
			int delta = getMaxDaysofMonth(year, i);
			count += delta;
		}
		
		count += day -1;
		
		int weekday = (count + STANDARD_WEEKDAY) %7;
		return weekday;
		
	}
	public static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static final int[] LEAP_MAX_DAYS = {0, 31, 29, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30};
	
	public boolean isLeapYear(int year) {
		if(year % 4==0 && (year% 100 !=0 || year % 400 == 0)) {
			return true;
		}
		else
			return false;
	}
	
	public int getMaxDaysofMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		}
		else {
			return MAX_DAYS[month];
			
		}
	}

}
