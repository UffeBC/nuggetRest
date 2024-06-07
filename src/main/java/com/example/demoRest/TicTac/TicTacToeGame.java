package com.example.demoRest.TicTac;

public class TicTacToeGame {

    private static final int SIZE = 3;
    private char[][] board;
    private char currentPlayer;
    private GameState gameState;

    public TicTacToeGame() {
        this.board = new char[SIZE][SIZE];
        this.currentPlayer = 'X';
        this.gameState = GameState.IN_PROGRESS;
        initializeBoard();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void makeMove(int row, int col) {
        if (gameState != GameState.IN_PROGRESS || !isValidMove(row, col)) {
            return;
        }

        board[row][col] = currentPlayer;

        if (checkWin(row, col)) {
            gameState = (currentPlayer == 'X') ? GameState.X_WINS : GameState.O_WINS;
        } else if (checkDraw()) {
            gameState = GameState.DRAW;
        } else {
            switchPlayer();
        }
    }

    public void resetGame() {
        initializeBoard();
        currentPlayer = 'X';
        gameState = GameState.IN_PROGRESS;
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '-';
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private boolean checkWin(int row, int col) {
        // Check row
        if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
            return true;
        }
        // Check column
        if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
            return true;
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    private boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

