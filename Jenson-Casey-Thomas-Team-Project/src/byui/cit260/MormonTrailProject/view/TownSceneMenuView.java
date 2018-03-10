/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

/**
 *
 * @author Thomas
 */
public class TownSceneMenuView extends ViewInterface.View {
    
    public TownSceneMenuView() {
        super("\nPlease choose an option: "
                + "\n********************************************"
                + "\n| Town Scene |"
                + "\n********************************************"
                + "\nG - Visit the General Store"   
                + "\nH - Visit the Hotel"
                + "\nQ - Return to the Trail"
                + "\n********************************************");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {

            case "G":
                this.generalStore();
                break;

            case "L":
                this.hotel();
                break;
   
            case "Q":
                this.quitGame();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again.");
                break;

        }

        return false;

    }

    private void generalStore() {
        
    }

    private void hotel() {
        
    }

    private void quitGame() {
       
    }
}
