/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;
import byui.cit260.MormonTrailProject.control.PlayControl;
import byui.cit260.MormonTrailProject.exceptions.PlayControlException;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;

/**
 *
 * @author Wayne Thomas
 */
public class GoHuntingView extends View {


    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
    private String weatherMessage;
    private String locationMessage;
    private String localResourcesMessage;

    private String weather;
    private String location;
    private String localResources;

    public GoHuntingView() {

        this.weatherMessage = "\nEnter current weather (bad=-5, poor=-3, good=0, excellent=2): ";
        this.locationMessage = "\nEnter your location (Town= -5, fort= -2, river= 2, landmark = 5): ";
        this.localResourcesMessage = "\nEnter local resources(biggame=5, smallgame=5, fish= 1, no vegetation=0): ";

    }

    public void displayGoHuntingView() throws PlayControlException {
        boolean done = false;
        do {

            this.weather = this.getUserString(this.weatherMessage);
            if (this.weather.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.weather);

        } while (!done);

        done = false;
        do {

            this.location = this.getUserString(this.locationMessage);
            if (this.location.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.location);

        } while (!done);

        done = false;
        do {

            this.localResources = this.getUserString(this.localResourcesMessage);
            if (this.localResources.toUpperCase().equals("Q")) // user is quitting
            {
                return; // exit the game
            }
            done = this.doNumericAction(this.localResources);

        } while (!done);

        done = false;

        this.displayNextView();

    }

    private String getUserString(String promptMessage) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + promptMessage);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
                if (value.length() < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return value; // return the value entered
    }

    private boolean doNumericAction(String userInput) {

        if (userInput.contains("[a-zA-Z]+") == true) {
            ErrorView.display(this.getClass().getName(), "\nInvalid Value: "
                    + "must be numeric only");
            return false;
        }

        if (userInput.length() < 1) {
            ErrorView.display(this.getClass().getName(), "\nInvalid Value: "
                    + "value cannot be blank");
            return false;
        }

        return true;
    }

    private char getUserChar(String promptMessage) {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + promptMessage);

            try {
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
                if (value.length() < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            try {
                if (value.length() > 1) { // value is too long
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be more than 1 character");
                    continue;
                }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            break; // end the loop
        }

        return value.charAt(0); // return the value entered
    }

    private GoHuntingView displayNextView() throws PlayControlException {
        // display a message showing user input
        System.out.println("\n***************************************"
                + "\n* Weather: " + this.weather
                + "\n* Location: " + this.location
                + "\n* Local Resources: " + this.localResources
                + "\n***************************************"
        );

        int weather = Integer.parseInt(this.weather);
        int location = Integer.parseInt(this.location);
        int localResources = Integer.parseInt(this.localResources);

        this.console.println(PlayControl.calcGatheringSuccess(weather, location, localResources));

        return null;
    }

    public void display() {

    }

    @Override
    public boolean doAction(String value) {
        return false;

    }

}
