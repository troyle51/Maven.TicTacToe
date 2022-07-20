package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    char player1 = 'X';
    char player2 = 'O';
    Character[][] board;
    public Board(Character[][] board) {
        this.board = board;
    }

    public Boolean isInFavorOfX() {
        if(getWinner().equals("X")){
            return true;
        }else return false;
    }

    public Boolean isInFavorOfO() {
        if(getWinner().equals("O")){
            return true;
        } else return false;
    }

    public Boolean isTie() {
        if(getWinner().equals("")){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if(board[0][0].equals('O') && board[0][1].equals('O') && board[0][2].equals('O')){
            return "O";
        } else if(board[0][0].equals('X') && board[0][1].equals('X') && board[0][2].equals('X')){
            return "X";
        }

        if(board[1][0].equals('X') && board[1][1].equals('X') && board[1][2].equals('X')){
            return "X";
        } else if (board[1][0].equals('O') && board[1][1].equals('O') && board[1][2].equals('O')){
            return "O";
        }

        if(board[2][0].equals('O') && board[2][1].equals('O') && board[2][2].equals('O')){
            return "O";
        } else if(board[2][0].equals('X') && board[2][1].equals('X') && board[2][2].equals('X')){
            return "X";
        }

        if(board[0][0].equals('X') && board[1][0].equals('X') && board[2][0].equals('X')){
            return "X";
        } else if(board[0][0].equals('O') && board[1][0].equals('O') && board[2][0].equals('O')){
            return "O";
        }

        if(board[0][1].equals('O') && board[1][1].equals('O') && board[2][1].equals('O')){
            return "O";
        }else if(board[0][1].equals('X') && board[1][1].equals('X') && board[2][1].equals('X')){
            return "X";
        }

        if(board[0][2].equals('X') && board[1][2].equals('X') && board[2][2].equals('X')){
            return "X";
        } else if(board[0][2].equals('O') && board[1][2].equals('O') && board[2][2].equals('O')){
            return "O";
        }

        if(board[0][0].equals('O') && board[1][1].equals('O') && board[2][2].equals('O')){
            return "O";
        } else if(board[0][0].equals('X') && board[1][1].equals('X') && board[2][2].equals('X')){
            return "X";
        }

        if(board[2][0].equals('X') && board[1][1].equals('X') && board[0][2].equals('X')){
            return "X";
        } else if(board[2][0].equals('O') && board[1][1].equals('O') && board[0][2].equals('O')){
            return "O";
        }

        return "";
    }


}
