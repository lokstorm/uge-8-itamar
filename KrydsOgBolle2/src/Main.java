import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        int player1 = 1;
        int player2 = 2;
        Scanner input = new Scanner(System.in);
        int start = 0;

        while (start == 0) {

            int suc = 0;
            int suc1 = 0;

            while (suc != 1) {

                board.printBoard();
                System.out.println("Player X:");
                System.out.println("Row:");
                int a = input.nextInt() - 1;
                System.out.println("Collum:");
                int b = input.nextInt() - 1;
                if (board.checkNum(a,b) && board.chechForAvailability(a, b))  {
                    board.changeBoard(1, a, b);
                    suc = 1;
                }
            }
            if(board.checkIfWin(1)){ start = 1; break;};

            while (suc1 != 1) {
                board.printBoard();
                System.out.println("Player O:");
                System.out.println("Row:");
                int a = input.nextInt() - 1;
                System.out.println("Collum:");
                int b = input.nextInt() - 1;
                if (board.checkNum(a,b) && board.chechForAvailability(a, b)) {
                    board.changeBoard(2, a, b);
                    suc1 = 1;
                }
            }
            if(board.checkIfWin(2)){ start = 1; break;};
        }
    }
}






