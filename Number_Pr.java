import java.util.*;
import java.math.*;
public class Number_Pr {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a number");
		BigDecimal x = new BigDecimal(input.next());
		System.out.println("Please input the other number");
		BigDecimal y = new BigDecimal(input.next());
		System.out.println("input:1.Plus 2.Minus 3.Multiply 4.Divide");
		switch(input.nextInt()) {
			case 1:
				System.out.println(x.add(y));
				break;
			case 2:
				System.out.println(x.subtract(y));
				break;
			case 3:
				System.out.println(x.multiply(y));
				break;
			case 4:
				System.out.println("The ? digit after the decimal point.");
				int a=input.nextInt();
				System.out.println(x.divide(y,a,BigDecimal.ROUND_HALF_UP));
				break;
		}
	}
}