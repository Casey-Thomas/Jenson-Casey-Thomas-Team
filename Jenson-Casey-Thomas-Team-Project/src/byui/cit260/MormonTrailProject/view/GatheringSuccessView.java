/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.control.GameControl;
import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.model.Player;
import java.util.Scanner;

/**
 *
 * @author Isabel Jenson
 */
public class GatheringSuccessView {
    
        private String weatherMessage;
        private String locationMessage;
        private String localResourcesMessage;
        private String weather;
        private String location;
        private String localResources;
      

    public GatheringSuccessView() {
        this.weather = "\nEnter today's weather (bad=-5, poor=-3, good=0, excellent=2): ";
        this.location = "\nEnter your current location (Town= -5, fort= -2, river= 2, landmark = 5): ";
        this.localResources = "\nChoose local resources (fruit trees=5, vegetables=5, edible leaves= 1, no vegetation=0): ";
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                      *"
                + "\n*         Are you ready to attempt gathering?          *"
                + "\n*                                                      *"
                + "\n*Your success will depend on the weather and location! *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*******************************************************"
        );

    }

    public void displayGatheringSuccessView() {
        boolean endOfView = false;

        do {
            String inputs = this.getInputs();

            if (inputs == null) {

                System.out.println("Please enter a valid choice to continue.");
            } else if ("V".equals(inputs)) {
                System.out.println("Eat your veggies!");
                break;
            } else if ("F".equals(inputs)) {
                System.out.println("Life is sweet, just like fruit!");
                break;

            } else if ("E".equals(inputs)) {
                System.out.println("I know you can do better than plants!");
                break;
            } else if (inputs.toUpperCase().equals("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }

        } while (endOfView != true);

    }

    private String getInputs() {
        System.out.println("Please, make a choice for gathering. Gather fruit(F), veggies(V) or plants(E)");
        Scanner userInput = new Scanner(System.in);
        String inputs = userInput.nextLine();
        inputs = inputs.trim();

        return inputs;
    }

    private boolean doAction(String inputs) {
        if (inputs.length() < 1) {
            System.out.println("\nInvalid input. Please, choose fruit(F), veggies(V), plants(E).");
            return false;
        }

        return true;
        

    }
    
    private GatheringSuccessView displayNextView() {
        // display a message showing user input
        System.out.println("\n***************************************"
                          + "\n* Current weather: " + this.weather
                          + "\n* Current location: " + this.location
                          + "\n* Local resources: " + this.localResources
                          + "\n***************************************"
                          );
        
        int weather = Integer.parseInt(this.weather);
        int location = Integer.parseInt(this.location);
        int localResources = Integer.parseInt(this.localResources);
        
      
       System.out.println(PlayControl.calcGatheringSuccess(weather,location, localResources));
       
       return null;
    }


    public void display() {

    }
}
