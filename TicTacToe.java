public class TicTacToe
{
	// Create a board array
	static char boardArray[][] = new char[11][11];

	// Game State Array
	static int gameState[][] = new int[3][3];

	static boolean p1win;
	static boolean p2win;

	public static void main(String[] args)
	{
		initBoard();

		System.out.println("This is my Tic Tac Toe game");

		printBoard();

		while( (!p1win) && (!p2win) )
		{
			// Prompt user for move

			// Display move

			// Check win condition

			// If P1 hasn't won yet, respond to move

			// Display ai move

			// Check win condition
		}
	}

	// Prompt user for move, check if move is valid
	public static void promptUser()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your move: ");

		String move = input.next();

		if(isMoveValid(move))
		{
			addMove(move, 1);
		}

	}

	public static boolean isMoveValid(String move)
	{
		if( move.equals("A1") || move.equals("a1") )
		{
			if(gameState[0][0] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else if( move.equals("B1") || move.equals("b1") )
		{
			if(gameState[0][1] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else if( move.equals("C1") || move.equals("c1") )
		{
			if(gameState[0][2] == 0)
			{
				return true;
			}

			else
				return false;
		}

		else if( move.equals("A2") || move.equals("a2") )
		{
			if(gameState[1][0] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else if( move.equals("B2") || move.equals("b2") )
		{
			if(gameState[1][1] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else if( move.equals("C2") || move.equals("c2") )
		{
			if(gameState[1][2] == 0)
			{
				return true;
			}

			else
				return false;
		}

		else if( move.equals("A3") || move.equals("a3") )
		{
			if(gameState[2][0] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else if( move.equals("B3") || move.equals("b3") )
		{
			if(gameState[2][1] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else if( move.equals("C3") || move.equals("c3") )
		{
			if(gameState[2][2] == 0)
			{
				return true;
			}

			else
				return false;
		}
		else
			return false;

	}

	public static boolean addMove(String move, int player)
	{
		if( move.equals("A1") || move.equals("a1") )
		{
			if(gameState[0][0] == 0)
			{
				gameState[0][0] = player;
				return true;
			}

			else
				return false;
		}
		else if( move.equals("B1") || move.equals("b1") )
		{
			if(gameState[0][1] == 0)
			{
				gameState[0][1] = player;
				return true;
			}

			else
				return false;
		}
		else if( move.equals("C1") || move.equals("c1") )
		{
			if(gameState[0][2] == 0)
			{
				gameState[0][2] = player;
				return true;
			}

			else
				return false;
		}

		else if( move.equals("A2") || move.equals("a2") )
		{
			if(gameState[1][0] == 0)
			{
				gameState[1][0] = player;
				return true;
			}

			else
				return false;
		}
		else if( move.equals("B2") || move.equals("b2") )
		{
			if(gameState[1][1] == 0)
			{
				gameState[1][1] = player;
				return true;
			}

			else
				return false;
		}
		else if( move.equals("C2") || move.equals("c2") )
		{
			if(gameState[1][2] == 0)
			{
				gameState[1][2] = player;
				return true;
			}

			else
				return false;
		}

		else if( move.equals("A3") || move.equals("a3") )
		{
			if(gameState[2][0] == 0)
			{
				gameState[2][0] = player;
				return true;
			}

			else
				return false;
		}
		else if( move.equals("B3") || move.equals("b3") )
		{
			if(gameState[2][1] == 0)
			{
				gameState[2][1] = player;
				return true;
			}

			else
				return false;
		}
		else if( move.equals("C3") || move.equals("c3") )
		{
			if(gameState[2][2] == 0)
			{
				gameState[2][2] = player;
				return true;
			}

			else
				return false;
		}
		else
			return false;

	}

	// Initialize the board array with values;
	public static void initBoard()
	{
		int row = 0;
		int col = 0;

		p1win = FALSE;
		p2win = FALSE;

		for(row = 0; row < 3; row++)
		{
			for(col = 0; col < 3; col++)
			{
				gameState[row][col] = 0;
			}
		}

		for(row = 0; row < 11; row++)
		{
			for(col = 0; col < 11; col++)
			{
				boardArray[row][col] = ' ';

				if( ((col == 3) || (col == 7)) && ((row != 3) || (row != 7)) )
				{
					boardArray[row][col] = '|';
				}
				else if( ((col != 3) || (col != 7)) && ((row == 3) || (row == 7)) )
				{
					boardArray[row][col] = '-';
				}

				if( ((col == 3) || (col == 7)) && ((row == 3) || (row == 7)) )
				{
					boardArray[row][col] = '+';
				}

				if( (col == 1) && ((row == 2) || (row == 6) || (row == 10)) )
				{
					boardArray[row][col] = 'A';
				}

				if( (col == 5) && ((row == 2) || (row == 6) || (row == 10)) )
				{
					boardArray[row][col] = 'B';
				}

				if( (col == 9) && ((row == 2) || (row == 6) || (row == 10)) )
				{
					boardArray[row][col] = 'C';
				}

				if( (row == 2) && ((col == 2) || (col == 6) || (col == 10)) )
				{
					boardArray[row][col] = '1';
				}

				if( (row == 6) && ((col == 2) || (col == 6) || (col == 10)) )
				{
					boardArray[row][col] = '2';
				}

				if( (row == 10) && ((col == 2) || (col == 6) || (col == 10)) )
				{
					boardArray[row][col] = '3';
				}
			}
		}

		boardArray[2][1] = 'A';
	}

	public static void printBoard()
	{
		int row = 0;
		int col = 0;

		for(row = 0; row < 11; row++)
		{
			for(col = 0; col < 11; col++)
			{
				System.out.print(boardArray[row][col]);
			}
			System.out.println();
		}
		System.out.print("printBoard");
	}
}