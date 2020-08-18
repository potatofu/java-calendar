package mycalendar;

import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String inputValue = scanner.nextLine();
		String[] splitValue = inputValue.split(",");
		int first = Integer.parseInt(splitValue[0]);
		int second = Integer.parseInt(splitValue[1]);
		System.out.println("두 수의 합은 " + (first+second) + "입니다");
		
		scanner.close();
	}
}
