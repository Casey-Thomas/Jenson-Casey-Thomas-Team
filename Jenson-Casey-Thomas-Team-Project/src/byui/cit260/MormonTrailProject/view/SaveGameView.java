/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.exceptions.GameControlException;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Jenson, Casey, Thomas
 */
public class SaveGameView extends View {

    public SaveGameView() throws GameControlException {
    }

    public SaveGameView(String message) {
        super(message);
    }

    private boolean doAction(String[] inputs) {
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();
        if (inputs != null) {

            try {
                game.saveGame(game);
                throw new GameControlException();

            } catch (GameControlException e) {

                ErrorView.display(this.getClass().getName(), e.getMessage());
                return false;
            } finally {
                this.console.println("The file was saved successfully to ");
                return true;
            }
        }
        return false;
    }

    private String[] getInputs(String promptMessage) {
        String input = "";
        String[] inputs = new String[]{input};

        try {
            boolean valid = false;

            while (!valid) {

                input = this.keyboard.readLine();

                if (inputs.length < 1) {

                    ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;

            }
        } catch (Exception e) {

            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }

        this.console.println("\n" + promptMessage);

        return inputs;

    }

    @Override
    public boolean doAction(String value) {
        return false;

    }

}
