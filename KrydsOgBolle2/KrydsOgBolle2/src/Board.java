public class Board {

    int[][] board = new int[3][3];


    void newBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int ii = 0; ii < board[i].length; ii++) {
                board[i][ii] = 0;
            }
        }
    }

    void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.print(" | ");
            for (int ii = 0; ii < board[i].length; ii++) {
                if (board[i][ii] == 1) {
                    System.out.print("X");
                    System.out.print(" | ");
                } else if (board[i][ii] == 2) {
                    System.out.print("O");
                    System.out.print(" | ");
                } else if (board[i][ii] == 0) {
                    System.out.print("-");
                    System.out.print(" | ");
                }
            }
            System.out.println("");
        }
    }

    void changeBoard(int player, int changeV, int changeH) {
        board[changeV][changeH] = player;
    }

    boolean checkNum(int changeV, int changeH) {
        if (changeV > 2 || changeH > 2) {
            System.out.println("Dårlig tal prøv igen");
            return false;
        } else {
            return true;
        }
    }

    boolean chechForAvailability(int changeV, int changeH) {
        if (board[changeV][changeH] == 1 || board[changeV][changeH] == 2) {
            System.out.println("Allerede taget");
            return false;
        } else {
            return true;
        }
    }

    boolean checkIfWin(int player) {
        for (int i = 0; i < board.length; i++) {
            for (int ii = 0 ; ii < board[i].length; ii++) {
                if (board[0][ii] == player && board[1][ii] == player && board[2][ii] == player) {
                    System.out.println(player + "Vinder");
                    return true;
                }else if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                    System.out.println(player + "Vinder");
                    return true;
                }else if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
                    System.out.println(player + "Vinder");
                    return true;
                }else if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
                    System.out.println(player + "Vinder");
                    return true;
                }
            }
        }
        return false;
    }
}