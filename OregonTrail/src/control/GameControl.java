/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Player;
import oregontrail.OregonTrail;


/**
 *
 * @author Fernando
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        OregonTrail.setPlayer(player);
        return player;
    }
    
}
