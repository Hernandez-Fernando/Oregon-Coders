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
import control.RiverControl;
import view.StartProgramView;

/**
 *
 * @author Fernando
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
}
}
