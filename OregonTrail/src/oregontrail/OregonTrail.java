/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import model.Game;
import model.Location;
import model.Player;
import model.Map;

/**
 *
 * @author Fernando
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Mary");
        playerOne.setBestScore(100.0);
        
        Game game = new Game();        
        game.setPlayer(playerOne);
        
        Map map = new Map();
        map.setDescription("Map Testing");
        map.setRowCount(10);
        map.setCityName("City of Testers");
        map.setColumnCount(200);
        map.setCurrentCity("City of Developers");
        map.setWearther("Testing");
                
        Location location = new Location();
        location.setRow(10);
        location.setColumn(21);
        location.setCity("City of Test A");
        location.setDays(2);
        location.setVisited(true);
        
        
        System.out.println("Game Object: " + game.toString());
        System.out.println("Player Object: " + playerOne.toString());
        System.out.println("Map: " + map.toString());
        System.out.println("Location: " + location.toString());
    }
    
}
