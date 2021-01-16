package day17;

import day9.Task2.Figure;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figures = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
        ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for(ChessPiece chessPiece: figures){
            System.out.print(chessPiece.getFigureDesignation() + " ");
        }
    }
}