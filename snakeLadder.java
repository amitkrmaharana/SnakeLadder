public class SnakeLadder {

	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	public static final int IS_NO_PLAY = 0;


	public static void main(String[] args) {
		int player1_position = 0;
		int player2_position = 0;
		int dice_roll1_count = 0;
		int dice_roll2_count = 0;
		System.out.println("Welcome to Snake and Ladder Simulation Program");
		while (player1_position < 100 && player2_position < 100) {
			double dice_roll1 = Math.floor(Math.random() * 10) % 6 + 1;
			double play_check1 = Math.floor(Math.random() *10) % 3;
			double dice_roll2 = Math.floor(Math.random() * 10) % 6 + 1;
                        double play_check2 = Math.floor(Math.random() * 10) % 3;
			dice_roll1_count++;
			dice_roll2_count++;
			switch((int)play_check1) {
				case IS_LADDER:
					while (play_check1 == IS_LADDER && player1_position < 100) {
						player1_position += dice_roll1;
						System.out.println("LADDER");
						if (player1_position > 100)
                                			player1_position -= dice_roll1;
						dice_roll1 = Math.floor(Math.random() * 10) % 6 + 1;
                        			play_check1 = Math.floor(Math.random() *10) % 3;
						dice_roll1_count++;
						switch((int)play_check1) {
							case IS_SNAKE:
								player1_position -= dice_roll1;
                                        			if (player1_position < 0)
                                                			player1_position = 0;
                                        			System.out.println("SNAKE");
                                        			break;
							case IS_NO_PLAY:
								System.out.println("NO PLAY");
								break;
						}
					}
				break;
				case IS_SNAKE:
					player1_position -= dice_roll1;
					if (player1_position < 0)
						player1_position = 0;
					System.out.println("SNAKE");
					break;
				default:
					System.out.println("NO PLAY");
			}
			if (player1_position > 100)
				player1_position -= dice_roll1;
			System.out.println("Player1 is at position "+player1_position);
			switch((int)play_check2) {
                                case IS_LADDER:
                                        while (play_check2 == IS_LADDER && player2_position < 100) {
                                                player2_position += dice_roll2;
                                                System.out.println("LADDER");
						if (player2_position > 100)
                                			player2_position -= dice_roll2;
						dice_roll2 = Math.floor(Math.random() * 10) % 6 + 1;
			                        play_check2 = Math.floor(Math.random() * 10) % 3;
						dice_roll2_count++;
                                                switch((int)play_check2) {
                                                        case IS_SNAKE:
                                                                player2_position -= dice_roll2;
                                                                if (player2_position < 0)
                                                                        player2_position = 0;
                                                                System.out.println("SNAKE");
                                                                break;
                                                        case IS_NO_PLAY:
                                                                System.out.println("NO PLAY");
                                                                break;
						}
                                        }
                                break;
                                case IS_SNAKE:
                                        player2_position -= dice_roll2;
                                        if (player2_position < 0)
                                                player2_position = 0;
						System.out.println("SNAKE");
                                        break;
				default:
					System.out.println("NO PLAY");
                        }
                        if (player2_position > 100)
                                player2_position-=dice_roll2;
                        System.out.println("Player2 is at position "+player2_position);

		}
		if (player1_position == 100)
			System.out.println("Player1 wins the game");
		else
			System.out.println("Player2 wins the game");
		System.out.println("The dice rolled by player1 is "+dice_roll1_count+" times.");
		System.out.println("The dice rolled by player2 is "+dice_roll2_count+" times.");
	}
}
