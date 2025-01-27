package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0; i < pieces.length; i++) {			//Linhas
			System.out.print((8 - i) + " ");                //Para começar as linhas do 8 7 6 .....
			
			for(int j = 0; j < pieces.length; j++) {        //Colunas
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) { 			//Função para se nao tiver nenhuma peça, para printar "-" 
			System.out.print("-");
		}
		else { 							// caso tiver, ira mostrar a peça
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
