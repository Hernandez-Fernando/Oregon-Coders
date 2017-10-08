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
import model.SuppliesBag;
import model.Supply;
import model.Animal;
import model.Team;
import model.Wagon;
import model.Person;

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
        
        Supply supply = new Supply();
        supply.setName("banana");
        supply.setAmount(4);
        supply.setCategory("food");
        supply.setPrice(0.10);
        
        SuppliesBag bag = new SuppliesBag();
        bag.setAllowedQuantity(10);
        bag.addSupplyItem(supply);
        
        System.out.println("Game Object: " + game.toString());
        System.out.println("Player Object: " + playerOne.toString());
        System.out.println("Map: " + map.toString());
        System.out.println("Location: " + location.toString());
        System.out.println("Supply: " + supply.toString());
        System.out.println("SuppliesBag: " + bag.toString());
        
        // Person Class Test
        Person personOne = new Person();
        personOne.setName("Fernando Hernandez");
        personOne.setProfession("Developer");
        personOne.setHealthStatus("Good");
        personOne.setHealthPerCent(96);
        
        System.out.println(personOne.toString());
        
        //Team Class Test
        Team teamOne = new Team();
        teamOne.setLocation("Indianapolis");
        teamOne.setBudget(1600);
        
        System.out.println(teamOne.toString());
        
        //Wagon Class Test
        Wagon wagonTeam = new Wagon();
        wagonTeam.setStatus("Good");
        
        System.out.println(wagonTeam.toString());
        
        //Animal Class Test
        Animal rabit = new Animal();
        rabit.setName("Rabit");
        rabit.setWeigth(12);
        rabit.setLocation(9.12);
        rabit.setStatus("Alive");
        
        System.out.println(rabit.toString());
    }
    
}
