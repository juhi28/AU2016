package juhi;

import java.util.Scanner;

public class prog1 implements learning {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1 + val2;
	}

	@Override
	public Integer Subtract(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1 - val2;
	}

	@Override
	public Integer multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1 * val2;
	}

	@Override
	public Integer divide(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1 / val2;
	}

	public static void main(String[] args) {
		prog1 cal = new prog1();
		Integer val1, val2, choice, ans = null;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		val1 = input.nextInt();
		System.out.println("enter the second number");
		val2 = input.nextInt();

		System.out.println(" enter your choice 1.add \n 2. subtract \n 3.divide \n 4.multiply");
		choice = input.nextInt();

		cal.add(val1, val2);

		switch (choice) {

		case 1:
			ans = cal.add(val1, val2);
			break;
		case 2:
			ans = cal.Subtract(val1, val2);
			break;
		case 3:
			ans = cal.divide(val1, val2);
			break;
		case 4:
			ans = cal.multiply(val1, val2);
			break;
		default:
			  System.out.println(" wrong choice");
			  break;

		}

		System.out.println(ans);

	}

}
