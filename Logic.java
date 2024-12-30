import java.util.Scanner;

public class Logic {
    
    public Logic () {}

    public void start () {
        Scanner scan = new Scanner(System.in);
        Board board = new Board(Board.getStartingFen());
        System.out.println(board.getPosition());
        System.out.println();
        System.out.println(Moves.generatePseudoLegalMoves(board)); 

        int response = 0;
        while (response != -1) {
            
            int[] move = new int[2];
            System.out.print("Enter a Starting Index: -1 to exit: ");
            response = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter an Ending Index: ");
            int endingIndex = scan.nextInt();
            scan.nextLine();
            move[0] = response;
            move[1] = endingIndex;
            Game.addMove(move);
            board.setPosition(Game.updatePosition(board.getPosition(), move));
            System.out.println("White King: " + Moves.generateCastlingMoves(Pieces.WHITE_KING_START_INDEX, board));
            System.out.println("Black King: " + Moves.generateCastlingMoves(Pieces.BLACK_KING_START_INDEX, board));
            System.out.println(board.getPosition());
            System.out.println(Game.allMovesTaken);
        }


    }
}