import java.util.StringTokenizer;

class Birthdays {
	public static void main(String[] arguments) {
		StringTokenizer st1;
		String birthday = "12/04/1981";
		String day, month, year;
		
		st1 = new StringTokenizer(birthday, "/");
		month = st1.nextToken();
		day = st1.nextToken();
		year = st1.nextToken();
		
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		System.out.println("Year: " + year);
	

	}
}