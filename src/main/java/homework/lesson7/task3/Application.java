package homework.lesson7.task3;

import homework.lesson7.task3.chess.Player;
import homework.lesson7.task3.chess.Position;
import homework.lesson7.task3.figures.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new King(Player.WHITE, "C1"));
        figures.add(new Queen(Player.WHITE, "C4"));
        figures.add(new Rook(Player.WHITE, "D5"));
        figures.add(new Knight(Player.WHITE, "F2"));
        figures.add(new Bishop(Player.WHITE, "E7"));
        figures.add(new Pawn(Player.BLACK, "F6"));
        figures.add(new Pawn(Player.BLACK, "F2"));
        figures.add(new Pawn(Player.BLACK, "D1"));
        figures.add(new Pawn(Player.WHITE, "F2"));
        figures.add(new Pawn(Player.WHITE, "B4"));
        figures.add(new Pawn(Player.WHITE, "B8"));
        figures.add(new Pawn(Player.WHITE, "B1"));

        for (ChessFigure figure : figures)
            printMoves(figure);
    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }

}
