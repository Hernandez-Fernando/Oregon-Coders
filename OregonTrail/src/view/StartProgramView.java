/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Fernando
 */
public class StartProgramView {
    
    private String promptMessage;
    
    
    public StartProgramView() {

            this.promptMessage = "\nPlease enter your name:";
            this.displayBanner();

    }

    private void displayBanner() {
        System.out.println("\n***************************"
                + "\n*"
                + "\n This is a Oregon Trail Game Version"
                + "\n* In this game you will experice the life"
                + "\n* of a Pionner crossing the country to from"
                + "\n* Independence Missuri to Oregon State."
                + "\n*"
                + "\n* You will have plan your trip by choosing"
                + "\n* when to start your journey, the kind and"
                + "\n* amount of supplies to carry for your trip, etc."
                + "\n*"
                + "\n* During your trip you will face bad weather"
                + "\n* sickness and even death. You will need to take smart"
                + "\n* choices in order to finish your journey safetly. "
                + "\n*"
                + "\n* Good luck!"
                + "\n*"
                + "\n* -Oregon Coders");
    }

    public void displayStartProgramView() {
       System.out.println("The function was called");
    }
    
                        
    
}
