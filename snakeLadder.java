public class snakeLadder {

	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;

	public static void main(String[] args) {
		int player1_position = 0;
		int player2_position = 0;
		int dice_roll_count = 0;
		System.out.println("Welcome to Snake and Ladder Simulation Program");
		while (player1_position < 100 && player2_position < 100) {
			double dice_roll1 = Math.floor(Math.random() * 10) % 6 + 1;
			double play_check1 = Math.floor(Math.random() *10) % 3;
			double dice_roll2 = Math.floor(Math.random() * 10) % 6 + 1;
                        double play_check2 = Math.floor(Math.random() *10) % 3;
			dice_roll_count++;
			switch((int)play_check1) {
				case IS_LADDER:
					player1_position+=dice_roll1;
					break;
				case IS_SNAKE:
					player1_position-=dice_roll1;
					if (player1_position < 0)
						player1_position = 0;
					break;
			}
			if (player1_position > 100)
				player1_position-=dice_roll1;
			System.out.println("Player1 is at position "+player1_position);
			switch((int)play_check2) {
                                case IS_LADDER:
                                        player2_position+=dice_roll2;
                                        break;
                                case IS_SNAKE:
                                        player2_position-=dice_roll2;
                                        if (player2_position < 0)
                                                player2_position = 0;
                                        break;
                        }
                        if (player2_position > 100)
                                player2_position-=dice_roll2;
                        System.out.println("Player2 is at position "+player2_position);

		}
		if (player1_position == 100)
			System.out.println("Player1 wins the game");
		else
			System.out.println("Player2 wins the game");
		System.out.println("The dice was rolled for "+dice_roll_count+" times.");
	}
}
