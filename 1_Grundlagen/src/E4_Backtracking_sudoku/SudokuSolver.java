package E4_Backtracking_sudoku;

import java.util.stream.IntStream;

public class SudokuSolver {

	private static final int BOARD_START_INDEX = 0;
	private static final int BOARD_SIZE = 9;
	private static final int LEER = 0;
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 9;
	private static final int SUBSECTION_SIZE = 3;
	
	static int[][]board = {
			  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
			  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
			  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
			  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
			  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
			  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
			  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
			  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
			  { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
			};
	
	
	private static boolean solve(int[][]board) {
		
		//Solange es Teillösungen gibt
	    for (int reihe = BOARD_START_INDEX; reihe < BOARD_SIZE; reihe++) {
	        for (int spalte = BOARD_START_INDEX; spalte < BOARD_SIZE; spalte++) {
	            if (board[reihe][spalte]== LEER) {
	                for (int zahl = MIN_VALUE; zahl <= MAX_VALUE; zahl++) {
	                    
	                	//Wähle Teillösung
	                	board[reihe][spalte]= zahl;
	                	
	             
	                    if (isValid(board, reihe, spalte) && solve(board)) {
	                        return true;
	                    }
	                    
	                    //
	                    board[reihe][spalte]= LEER;
	                }
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	
	private static void printBoard() {
	    for (int reihe = BOARD_START_INDEX; reihe < BOARD_SIZE; reihe++) {
	        for (int spalte = BOARD_START_INDEX; spalte < BOARD_SIZE; spalte++) {
	            System.out.print(board[reihe][spalte] + " ");
	        }
	        System.out.println();
	    }
	}
	
	
	static boolean checkConstraint(
			  int[][] board, 
			  int reihe, 
			  boolean[] constraint, 
			  int spalte) {
			    if (board[reihe][spalte] != LEER) {
			        if (!constraint[board[reihe][spalte] - 1]) {
			            constraint[board[reihe][spalte] - 1] = true;
			        } else {
			            return false;
			        }
			    }
			    return true;
			}
	
	private static boolean pruefeQuadrat(int[][] board, int row, int column) {
	    boolean[] constraint = new boolean[BOARD_SIZE];
	    int subsectionRowStart = (row / SUBSECTION_SIZE) * SUBSECTION_SIZE;
	    int subsectionRowEnd = subsectionRowStart + SUBSECTION_SIZE;
	 
	    int subsectionColumnStart = (column / SUBSECTION_SIZE) * SUBSECTION_SIZE;
	    int subsectionColumnEnd = subsectionColumnStart + SUBSECTION_SIZE;
	 
	    for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
	        for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
	            if (!checkConstraint(board, r, constraint, c)) return false;
	        }
	    }
	    return true;
	}
	
	private static boolean pruefeSpalte(int[][] board, int column) {
	    boolean[] constraint = new boolean[BOARD_SIZE];
	    return IntStream.range(BOARD_START_INDEX, BOARD_SIZE)
	      .allMatch(row -> checkConstraint(board, row, constraint, column));
	}

	private static boolean pruefeReihe(int[][] board, int row) {
	    boolean[] constraint = new boolean[BOARD_SIZE];
	    return IntStream.range(BOARD_START_INDEX, BOARD_SIZE)
	      .allMatch(column -> checkConstraint(board, row, constraint, column));
	}
	
	private static boolean isValid(int[][] board, int row, int column) {
	    return (pruefeReihe(board, row)
	      && pruefeSpalte(board, column) 
	      && pruefeQuadrat(board, row, column));
	}
	
	
	public static void main(String[] args) {
		printBoard();
		
		solve(board);
		System.out.println();
		
		printBoard();
		
	}
	
}
