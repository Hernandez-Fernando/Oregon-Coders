/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author glauc
 */
public class Game {

    @Override
    public String toString() {
        return "Game{" + "player=" + player.getName() + '}';
    }
    private double totalime;
    private int noPeople;
    private Player player;
    private Team team;

    public double getTotalime() {
        return totalime;
    }

    public void setTotalime(double totalime) {
        this.totalime = totalime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    
}
