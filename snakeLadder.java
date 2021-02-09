public class SnakeLadder {

	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;

	public static void main(String[] args) {
		int player_position = 0;
		System.out.println("Welcome to Snake and Ladder Simulation Program");
		while (player_position < 100) {
			double dice_roll = Math.floor(Math.random() * 10) % 6 + 1;
			double play_check = Math.floor(Math.random() *10) % 3;
			switch((int)play_check) {
				case IS_LADDER:
					player_position+=dice_roll;
					break;
				case IS_SNAKE:
					player_position-=dice_roll;
					if (player_position < 0)
						player_position = 0;
					break;
			}
			if (player_position > 100)
				player_position-=dice_roll;
		}
		System.out.println("*******YOU WON*******");
		System.out.println("Player position is "+player_position);
	}
}
