/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import model.Game;
import model.Player;

/**
 *
 * @author Fernando
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player("Mary",10.0);
        Game game = new Game();
        
        game.setPlayer(playerOne);
        
        System.out.println("Game Object: " + game.toString());
        System.out.println("Player Object: " + playerOne.toString());
    }
    
}
