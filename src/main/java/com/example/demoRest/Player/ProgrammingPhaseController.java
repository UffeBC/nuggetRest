package com.example.demoRest.Player;

import com.example.demoRest.Player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgrammingPhaseController {

    @Autowired
    private IPlayerService playerService;

    @GetMapping(value = "/programming")
    public ResponseEntity<List<Player>> getPlayer()
    {
        List<Player> players = playerService.findAll();
        return ResponseEntity.ok().body(players);
    }

    @PostMapping("/programming")
    public ResponseEntity<String > addPlayer(@RequestBody Player p) {
        boolean added = playerService.addPlayer(p);
        if(added)
            return ResponseEntity.ok().body("added");
        else
            return ResponseEntity.internalServerError().body("not added");

    }

    @GetMapping("/programming/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable int id) {
        Player p = playerService.getPlayerById(id);
        return ResponseEntity.ok().body(p);
    }

    @PutMapping("/programming/{id}")
    public ResponseEntity<String> updatePlayer(@PathVariable int id, @RequestBody Player p) {
        boolean added = playerService.updatePlayer(id, p);
        return ResponseEntity.ok().body("updated");
    }

    @DeleteMapping("/programming/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        boolean deleted = playerService.deletePlayerById(id);
        return ResponseEntity.ok().body("deleted");
    }

}