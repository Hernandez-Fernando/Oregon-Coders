/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import model.Game;
import model.Player;
import model.Wagon;
import model.Person;
import model.Team;
import model.Animal;

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
