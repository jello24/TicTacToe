import java.util.Scanner;
import java.util.Random;

public class TicTacToe
{
	// Create a board array
	static char boardArray[][] = new char[11][11];

	// Game State Array
	static int gameState[][] = new int[3][3];

	static boolean p1win;
	static boolean p2win;
	static boolean draw;

	public static void main(String[] args)
	{
		initBoard();

		System.out.println("This is Jan's Tic Tac Toe game");
		System.out.println("Right now, you're just playing against a CPU who knows nothing.");

		printBoard();

		while( (!p1win) && (!p2win) && (!draw) )
		{
			// Prompt user for move
			promptUser();

			// Check win condition
			if(checkWin(1))
			{
				p1win = true;
			}
			else
				p1win = false;

			// If P1 hasn't won yet, respond to move
			if(!p1win)
			{
				cpuMove();
			}

			// Display ai move
			printBoard();

			// Check win condition
			if(checkWin(2))
			{
				p2win = true;
			}
			else
				p2win = false;
		}

		if(p1win)
			System.out.println("Player 1 wins!");
		else if(p2win)
			System.out.println("Player 2 wins!");
		else
			System.out.println("It's a draw!");
	}

	// Prompt user for move, check if move is valid
	public static void promptUser()
	{
		String move;

		do
		{
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter your move: ");

			move = input.next();

		}while(!isMoveValid(move));

		addMove(move, 1);

	}

	public static void cpuMove()
	{
		Random r = new Random(System.currentTimeMillis());

		int randInt;
		
		String move = "";

		do
		{
			randInt = r.nextInt(9);

			switch(randInt)
			{
				case 0:
					move = "a1";
					break;
				case 1:
					move = "b1";
					break;
				case 2:
					move = "c1";
					break;
				case 3:
					move = "a2";
					break;
				case 4:
					move = "b2";
					break;
				case 5:
					move = "c2";
					break;
				case 6:
					move = "a3";
					break;
				case 7:
					move = "b3";
					break;
				case 8:
					move = "c3";
					break;
				default:
					move = "a1";
					break;
			}

		}while(!isMoveValid(move));

		addMove(move, 2);
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

				if(player == 1)
				{
					boardArray[1][1] = 'X';
				}
				else if(player == 2)
				{
					boardArray[1][1] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[1][5] = 'X';
				}
				else if(player == 2)
				{
					boardArray[1][5] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[1][9] = 'X';
				}
				else if(player == 2)
				{
					boardArray[1][9] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[5][1] = 'X';
				}
				else if(player == 2)
				{
					boardArray[5][1] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[5][5] = 'X';
				}
				else if(player == 2)
				{
					boardArray[5][5] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[5][9] = 'X';
				}
				else if(player == 2)
				{
					boardArray[5][9] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[9][1] = 'X';
				}
				else if(player == 2)
				{
					boardArray[9][1] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[9][5] = 'X';
				}
				else if(player == 2)
				{
					boardArray[9][5] = 'O';
				}

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

				if(player == 1)
				{
					boardArray[9][9] = 'X';
				}
				else if(player == 2)
				{
					boardArray[9][9] = 'O';
				}

				return true;
			}

			else
				return false;
		}
		else
			return false;

	}

	public static boolean checkWin(int player)
	{
		if((gameState[0][0] == player) && (gameState[0][1] == player) && (gameState[0][2] == player))
		{
			return true;
		}
		else if((gameState[1][0] == player) && (gameState[1][1] == player) && (gameState[1][2] == player))
		{
			return true;
		}
		else if((gameState[2][0] == player) && (gameState[2][1] == player) && (gameState[2][2] == player))
		{
			return true;
		}

		else if((gameState[0][0] == player) && (gameState[1][0] == player) && (gameState[2][0] == player))
		{
			return true;
		}
		else if((gameState[0][1] == player) && (gameState[1][1] == player) && (gameState[2][1] == player))
		{
			return true;
		}
		else if((gameState[0][2] == player) && (gameState[1][2] == player) && (gameState[2][2] == player))
		{
			return true;
		}

		else if((gameState[0][0] == player) && (gameState[1][1] == player) && (gameState[2][2] == player))
		{
			return true;
		}
		else if((gameState[0][2] == player) && (gameState[1][1] == player) && (gameState[2][0] == player))
		{
			return true;
		}

		else
			return false;

	}

	// Initialize the board array with values;
	public static void initBoard()
	{
		int row = 0;
		int col = 0;

		p1win = false;
		p2win = false;
		draw = false;

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
	}
}