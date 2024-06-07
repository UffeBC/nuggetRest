package com.example.demoRest.Player;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService implements IPlayerService
{
    //creating an object of ArrayList
    ArrayList<Player> players = new ArrayList<Player>();

    public PlayerService() {
    //adding players to the List
        players.add(new Player(1, "P1", 9000,1));
        players.add(new Player(2, "P2",  60000,1));
        players.add(new Player(3, "P3", 9000,3));
        players.add(new Player(4, "P4", 24000,1));
        players.add(new Player(5, "P5", 30000,2));
        players.add(new Player(6, "P6 ", 10000,2));
    }

    @Override
    public List<Player> findAll()
    {
    //returns a list of player
        return players;
    }

    @Override
    public boolean addPlayer(Player p) {
        players.add(p);
        return true;
    }

    @Override
    public Player getPlayerById(int id) {
        for(Player p : players) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean updatePlayer(int id, Player p) {
        for(Player currProd : players) {
            if(currProd.getId() == id) {
                currProd.setId(p.getId());
                currProd.setPname(p.getPname());
                currProd.setX(p.getX());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePlayerById(int id) {
        ArrayList<Player> newPlayers = new ArrayList<Player>();
        int oldSize = players.size();
        players.forEach((player -> {
            if(player.getId() == id)
                    newPlayers.add(player);
        }));
        players = newPlayers;
        return oldSize < players.size() ? true : false;
    }
}