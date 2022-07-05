package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    char player1 = 'X';
    char player2 = 'O';
    public Board(Character[][] matrix) {
        matrix = new Character[3][3];
        Character ch = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                matrix[i][j] = ch++;
            }
        }
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
