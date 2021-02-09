public class SnakeLadder {

	public static void main(String[] args) {
		int player_position = 0;
		System.out.println("Welcome to Snake and Ladder Simulation Program");
		double dice_roll = Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("The dice rolled "+(int)dice_roll);
	}
}
