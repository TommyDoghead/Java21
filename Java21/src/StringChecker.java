class StringChecker {
	
	public static void main(String[] arguments) {
		String str = "Nobody ever went broke by buying IBM";
		System.out.println("The string is: " + str);
		System.out.println("Length of this string is: "
				+ str.length());
		System.out.println("The character at position 5: "
				+ str.charAt(5));
		System.out.println("The substring from 26 to 32: "
				+ str.substring(26, 32));
		System.out.println("The index of character v: "
				+ str.indexOf('v'));
		System.out.println("The index of the beginning of the : "
				+ "substring \"IBM\": " +str.indexOf("IBM"));
		System.out.println("The string in uppercase: : "
				+ str.toUpperCase());
	}
}