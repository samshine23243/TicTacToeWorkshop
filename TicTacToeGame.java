import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
	char symbol=' ';
	char[][] board;
	void createBoard()
	{
		board=new char[4][4];
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				board[i][j]=' ';
			}
		}
		
	}
	void chooseSymbol()
	{
		System.out.println("Choose Symbol:");
		System.out.println("Enter your choice(X/O):");
		symbol=sc.next().toUpperCase().charAt(0);
		System.out.println("selected:"+symbol);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToeGame obj=new TicTacToeGame();
		obj.createBoard();
		obj.chooseSymbol();

	}

}
