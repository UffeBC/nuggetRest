package com.example.demoRest.Player;

import java.util.List;

public interface IPlayerService
{
    List<Player> findAll();
    public Player getPlayerById(int id);
    boolean addPlayer(Player p);
    public boolean updatePlayer(int id, Player p);
    public boolean deletePlayerById(int id);
}