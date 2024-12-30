import java.util.ArrayList;

public class Game {
    
    public static ArrayList<int[]> allMovesTaken = new ArrayList<int[]>();
    //public static boolean kingMoved = Pieces.kingMoved(allMovesTaken, colorUp)

    public static void addMove (int[] move) {
        allMovesTaken.add(move);
    }

    public static ArrayList<Integer> updatePosition (ArrayList<Integer> position, int[] move) {
        int startingIndex = move[0];
        int endingIndex = move[1];
        position.set(endingIndex, position.get(startingIndex));
        position.set(startingIndex, Pieces.Empty);
        return position;
    }

}
