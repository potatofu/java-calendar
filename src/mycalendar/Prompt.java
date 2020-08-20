package mycalendar;

import java.util.Scanner;

public class Prompt {
		
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("wd")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else return 0;
	}
	
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		
		int month = 1;
		int year = 2000;

		while(true) {
			System.out.println("년도를 입력해주세요(exit: -1): ");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			if (year ==-1) break;
			System.out.println("달을 입력해주세요: ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			
			
			if(month >12 || month <1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printSampleCalendar(year, month);
		}
		System.out.println("아룡~");
		scanner.close();		
	}
	
	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
