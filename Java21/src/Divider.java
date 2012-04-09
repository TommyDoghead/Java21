public class Divider {
	public static void main(String[] arguments) {
		int num1 = 45, num2 = 7, answer, remainder;
		
		answer = num1 / num2;
		remainder = num1 % num2;
		System.out.println(num1 + " divided by " + num2 + " gives us " + answer + "\tremainder " + remainder);
	}
}