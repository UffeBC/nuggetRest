package com.example.demoRest.TicTac;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private TicTacToeGame ticTacToeGame;

    public GameController() {
        this.ticTacToeGame = new TicTacToeGame();
    }

    @GetMapping("/state")
    public GameState getGameState() {
        return ticTacToeGame.getGameState();
    }

    @PostMapping("/move")
    public GameState makeMove(@RequestParam int row, @RequestParam int col) {
        ticTacToeGame.makeMove(row, col);
        return ticTacToeGame.getGameState();
    }

    @PostMapping("/reset")
    public GameState resetGame() {
        ticTacToeGame.resetGame();
        return ticTacToeGame.getGameState();
    }
}
