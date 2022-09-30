package com.assignment9;



public class SudokuMatrix
{
	int[] mat[];
	int N;
	int SRN;
	SudokuMatrix(int N)
	{
		this.N = N;
		Double SRNd = Math.sqrt(N);
		SRN = SRNd.intValue();
		mat = new int[N][N];
	}
	public void fillValues()
	{
		fillDiagonal();
		fillRemaining(0, SRN);
	}
	void fillDiagonal()
	{
		for (int i = 0; i<N; i=i+SRN)
			fillBox(i, i);
	}
	boolean unUsedInBox(int rowStart, int colStart, int num)
	{
		for (int i = 0; i<SRN; i++)
			for (int j = 0; j<SRN; j++)
				if (mat[rowStart+i][colStart+j]==num)
					return false;
		return true;
	}


	void fillBox(int row,int col)
	{
		int num;
		for (int i=0; i<SRN; i++)
		{
			for (int j=0; j<SRN; j++)
			{
				do
				{
					num = randomGenerator(N);
				}
				while (!unUsedInBox(row, col, num));
				mat[row+i][col+j] = num;
			}
		}
	}


	int randomGenerator(int num)
	{
		return (int) Math.floor((Math.random()*num+1));
	}


	boolean CheckIfSafe(int i,int j,int num)
	{
		return (unUsedInRow(i, num) &&
				unUsedInCol(j, num) &&
				unUsedInBox(i-i%SRN, j-j%SRN, num));
	}


	boolean unUsedInRow(int i,int num)
	{
		for (int j = 0; j<N; j++)
			if (mat[i][j] == num)
				return false;
		return true;
	}


	boolean unUsedInCol(int j,int num)
	{
		for (int i = 0; i<N; i++)
			if (mat[i][j] == num)
				return false;
		return true;
	}


	boolean fillRemaining(int i, int j)
	{
		if (j>=N && i<N-1)
		{
			i = i + 1;
			j = 0;
		}
		if (i>=N && j>=N)
			return true;

		if (i < SRN)
		{
			if (j < SRN)
				j = SRN;
		}
		else if (i < N-SRN)
		{
			if (j==(int)(i/SRN)*SRN)
				j = j + SRN;
		}
		else
		{
			if (j == N-SRN)
			{
				i = i + 1;
				j = 0;
				if (i>=N)
					return true;
			}
		}

		for (int num = 1; num<=N; num++)
		{
			if (CheckIfSafe(i, j, num))
			{
				mat[i][j] = num;
				if (fillRemaining(i, j+1))
					return true;

				mat[i][j] = 0;
			}
		}
		return false;
	}

	public void printSudoku()
	{
		for (int i = 0; i<N; i++)
		{
			for (int j = 0; j<N; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int N = 9;
		SudokuMatrix sudoku = new SudokuMatrix(N);
		sudoku.fillValues();
		sudoku.printSudoku();
	}
}