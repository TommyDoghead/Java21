public class investment {
	public static void main(String[] arguments) {
		long stake = 14000;
		
		System.out.println("The initial investement stake was $" + stake);
		System.out.println("At the end of the first year the value had risen 40%");
		stake *= 1.4;
		System.out.println("This meant the investment was now worth " + stake);
		System.out.println("At the end of the second year the value had fallen by $1500");
		stake -= 1500;
		System.out.println("This meant the investment was now worth " + stake);
		System.out.println("At the end of the third year the value had risen 12%");
		stake *= 1.12;
		System.out.println("This meant the investment was now worth " + stake);	
		}
}