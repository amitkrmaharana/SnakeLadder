public class SnakeLadder {

	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;

	public static void main(String[] args) {
		int player_position = 0;
		System.out.println("Welcome to Snake and Ladder Simulation Program");
		double dice_roll = Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("The dice rolled "+(int)dice_roll);
		double play_check = Math.floor(Math.random() *10) % 3;
		switch((int)play_check) {
			case IS_LADDER:
				player_position+=dice_roll;
				break;
			case IS_SNAKE:
				player_position-=dice_roll;
				break;
		}
		System.out.println("Player position is "+player_position);
	}
}
