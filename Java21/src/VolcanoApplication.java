class VolcanoApplication {
	public static void main(String[] arguments) {
		VolcanoRobot dante = new VolcanoRobot();
		dante.status = "exploring";
		dante.speed = 2;
		dante.temperature = 510;
		
		dante.showAttributes();
		System.out.println("Increasing speed to 3.");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changing temperature to 670.");
		dante.temperature = 670;
		dante.showAttributes();
		System.out.println("Checking the temperature.");
		dante.checkTemperature();
		dante.showAttributes();
		
		VolcanoRobot virgil = new VolcanoRobot();
		virgil.status = "exploring";
		virgil.speed = 21;
		virgil.temperature = 5101;
		
		virgil.showAttributes();
		System.out.println("Increasing speed to 31.");
		virgil.speed = 31;
		dante.showAttributes();
		System.out.println("Changing temperature to 6700.");
		virgil.temperature = 6700;
		virgil.showAttributes();
		System.out.println("Checking the temperature.");
		virgil.checkTemperature();
		virgil.showAttributes();
	}
}